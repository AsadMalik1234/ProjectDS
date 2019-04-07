/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.util.logging.Logger;
import org.Muhammad.example.speaker.SpeakerGrpc;
import serviceui.Printer;
import serviceui.ServiceUI;

/**
 *
 * @author asadmalik
 */
public class SpeakerServer {

    private static final Logger logger = Logger.getLogger(SpeakerServer.class.getName());

    /* The port on which the server should run */
    private int port = 50055;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new SpeakerImpl())
                .build()
                .start();
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Muhammad", "_Speaker._udp.local.", "", port);
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                SpeakerServer.this.stop();
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
        final SpeakerServer server = new SpeakerServer();
        server.start();
        server.blockUntilShutdown();
    }

    private class SpeakerImpl extends SpeakerGrpc.SpeakerImplBase {

        private Printer ui;

        public SpeakerImpl() {
            String name = "Muhammad";
            String serviceType = "_Speaker._udp.local.";
            ui = new ServiceUI(name + serviceType);
        }

        public void speakerMode(org.Muhammad.example.speaker.SpeakerModeRequest request,
                io.grpc.stub.StreamObserver<org.Muhammad.example.speaker.SpeakerModeResponse> responseObserver) {

        }
    }

}
