/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import io.grpc.stub.StreamObserver;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;
import org.Muhammad.example.clock.ClockActionResponse;
import org.Muhammad.example.clock.ClockGrpc;

import serviceui.Printer;
import serviceui.ServiceUI;

/**
 *
 * @author asadmalik
 */
public class ClockServer {

    private static final Logger logger = Logger.getLogger(ClockServer.class.getName());

    /* The port on which the server should run */
    private int port = 50059;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new ClockImpl())
                .build()
                .start();
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Muhammad", "_Clock._udp.local.", "", port);
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                ClockServer.this.stop();
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
        final ClockServer server = new ClockServer();
        server.start();
        server.blockUntilShutdown();
    }

    private class ClockImpl extends ClockGrpc.ClockImplBase {

        private Printer ui;
        private int time = 0;

        public ClockImpl() {
            String name = "Muhammad";
            String serviceType = "_Clock._udp.local.";
            ui = new ServiceUI(name + serviceType);
        }

//        @Override
//        public void clockAction(com.google.protobuf.Empty request,io.grpc.stub.StreamObserver<ClockActionResponse> responseObserver) {
//
//            Timer t = new Timer();
//            t.schedule(new RemindTask(responseObserver), 0, 2000);
//
//        }
        
         public void clockAction(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.Muhammad.example.clock.ClockActionResponse> responseObserver) {
       Timer t = new Timer();
            t.schedule(new RemindTask(responseObserver), 0, 2000);

    }
        
        class RemindTask extends TimerTask {

            StreamObserver<ClockActionResponse> obj;

            public RemindTask(StreamObserver<ClockActionResponse> j) {
                obj = j;
            }

            @Override
            public void run() {
                if (time < 24) {
                    ClockActionResponse status = ClockActionResponse.newBuilder().setClockTime(time).build();
                    ui.append(status.toString());
                    obj.onNext(status);
                    time += 1;
                } else {
                    obj.onCompleted();
                    this.cancel();
                }
            }
        }

    }

}
