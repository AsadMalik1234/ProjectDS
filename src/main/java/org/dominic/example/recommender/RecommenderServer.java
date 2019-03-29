package org.dominic.example.recommender;

import com.google.protobuf.Empty;
import org.jpdna.grpchello.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import java.util.logging.Logger;
import org.dominic.example.bed.BedStatus;
import services.JmDNSRegistrationHelper;

public class RecommenderServer {

    private static final Logger logger = Logger.getLogger(RecommenderServer.class.getName());

    /* The port on which the server should run */
    private int port = 50051;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new RecommenderImpl())
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Dominics", "_movie-recommender._udp.local.", "", port);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                RecommenderServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon
     * threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws Exception {
        final RecommenderServer server = new RecommenderServer();
        server.start();
        server.blockUntilShutdown();
    }

    private class RecommenderImpl extends MovieRecommenderGrpc.MovieRecommenderImplBase {

        private List<Movie> movies;

        public RecommenderImpl() {
            movies = new ArrayList<Movie>(); //list of all the movies 
            Movie terminator = Movie.newBuilder().setTitle("Terminator").setGenre("Awesome").build();
            Movie predator = Movie.newBuilder().setTitle("Predator").setGenre("Awesomest").build();
            Movie terminator2 = Movie.newBuilder().setTitle("Terminator 2").setGenre("Awesomeer").build();
            movies.add(terminator);
            movies.add(predator);
            movies.add(terminator2);
            
            //constructer with three diffrent movies 

        }

        @Override
        public void recommendMovie(Profile request, StreamObserver<Recommendations> responseObserver) { // tack in profile send back recommendations
            List<Movie> seenMovies = request.getSeenList(); //list of movies seen 
            List<Movie> recommendations = new ArrayList<Movie>(); // list of movie recommendations 
            for (Movie movie : movies) {// go throw the movies the services know about, it only three of them above 
                boolean seen = false;
                for (Movie option : seenMovies) {// goes throw all the movies the person knows
                    if (movie.getTitle().equals(option.getTitle())) {
                        seen = true;
                    }
                }
                if (!seen) {
                    recommendations.add(movie); // it only add the movies it the person has not seen 
                }
            }

            responseObserver.onNext(Recommendations.newBuilder().addAllMovies(recommendations).build()); // will stick all the movies and send it back 
            responseObserver.onCompleted();

        }

        @Override
        public void getAllMovies(Empty request,
                StreamObserver<Recommendations> responseObserver) {
            Recommendations all = Recommendations.newBuilder().addAllMovies(movies).build();
            responseObserver.onNext(all);
            responseObserver.onCompleted();
            
        }
        

    public void streamNewMovies(Empty request,
        StreamObserver<Movie> responseObserver) {
                    Timer t = new Timer();
            t.schedule(new StreamTask(responseObserver), 0, 2000);
    }
    



        class StreamTask extends TimerTask {

            StreamObserver<Movie> o;
            int index = 0;

            public StreamTask(StreamObserver<Movie> j) {
                o = j;
            }

            @Override
            public void run() {
                if (index == movies.size() ) {
                    o.onCompleted();
                    this.cancel();
                } else {
                    o.onNext(movies.get(index++));
                }
            }
        }
    }
}
