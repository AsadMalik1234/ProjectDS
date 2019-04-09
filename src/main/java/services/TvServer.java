/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.logging.Logger;
import org.Muhammad.example.tv.TvChannelRequest;
import org.Muhammad.example.tv.TvChannelResponse;
import org.Muhammad.example.tv.TvFunction;
import org.Muhammad.example.tv.TvGrpc;
import org.Muhammad.example.tv.TvModeRequest;
import org.Muhammad.example.tv.TvModeResponse;
import serviceui.Printer;
import serviceui.ServiceUI;

/**
 *
 * @author asadmalik
 */
public class TvServer {
    
    private static final Logger logger = Logger.getLogger(TvServer.class.getName());

    /* The port on which the server should run */
    private int port = 50057;
    private Server server;
  

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new TvImpl())
                .build()
                .start();
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Muhammad", "_Tv._udp.local.", "", port);
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                TvServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws Exception {
        final TvServer server = new TvServer();
        server.start();
        server.blockUntilShutdown();
    }

    private class TvImpl extends TvGrpc.TvImplBase {
        
        private Printer ui;

        public TvImpl() {
            String name = "Muhammad";
            String serviceType = "_Tv._udp.local.";
            ui = new ServiceUI(name + serviceType);
        }
        
        
     public void tvMode(TvModeRequest request, StreamObserver<TvModeResponse> responseObserver) {
     
       TvFunction tvFunction = request.getTvFunction();
       String tvModeRequest = tvFunction.getTvOn();
       tvModeRequest = tvFunction.getTvOff();
        ui.append(tvModeRequest);
        
        TvModeResponse response = TvModeResponse.newBuilder()
                .build();
        
         responseObserver.onNext(response);
          responseObserver.onCompleted();
              
    }

    /**
     */
    public void tvChannel(TvChannelRequest request, StreamObserver<TvChannelResponse> responseObserver) {
        
         TvFunction tvFunction = request.getTvFunction();
         String tvChannelRequest = tvFunction.getChannel();
          ui.append(tvChannelRequest);
          
          TvChannelResponse response = TvChannelResponse.newBuilder()
                  .build();
           responseObserver.onNext(response);
          responseObserver.onCompleted();
          
         
         
        
       
    }
    }
    
    
    
    

    
}
