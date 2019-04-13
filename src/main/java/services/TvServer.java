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
    private int tvStatus = 0; // 0 is OFF; 1 is ON
    private int channel = 0;

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
            String tvModeRequested;
            String tvModePerformed = null;

            if (tvFunction.getTvOn() != null && !tvFunction.getTvOn().equalsIgnoreCase("")) {
                tvModeRequested = tvFunction.getTvOn();
                ui.append(tvModeRequested);

                if (tvStatus == 0) {
                    tvModePerformed = "TV turned on. Channel is "+channel;
                    tvStatus = 1;
                } else if (tvStatus == 1) {
                    tvModePerformed = "TV already turned on";
                }

            } else if (tvFunction.getTvOff() != null && !tvFunction.getTvOff().equalsIgnoreCase("")) {
                tvModeRequested = tvFunction.getTvOff();
                ui.append(tvModeRequested);

                if (tvStatus == 1) {
                    tvModePerformed = "TV turned off";
                    tvStatus = 0;
                    channel = 0;
                } else if (tvStatus == 0) {
                    tvModePerformed = "TV already off";
                }

            }

            TvModeResponse response = TvModeResponse.newBuilder().setMode(tvModePerformed).build();

            responseObserver.onNext(response);
            // complete the RPC call
            responseObserver.onCompleted();

        }

        /**
         */
        public void tvChannel(TvChannelRequest request, StreamObserver<TvChannelResponse> responseObserver) {

            TvFunction tvFunction = request.getTvFunction();
            String tvChannelRequest = tvFunction.getChannel();
            ui.append(tvChannelRequest);
            String newChannel;

            if (tvStatus == 0) {
                newChannel = "TV is off. Please turn on the TV";
            } else {
                if (channel <= 4) {
                    channel = channel + 1;
                    newChannel = "Channel changed to " + channel;
                } else {
                    channel = 0;
                    newChannel = "Channel changed to " + channel;
                }
            }

            TvChannelResponse response = TvChannelResponse.newBuilder().setChannel(newChannel).build();

            responseObserver.onNext(response);
            // complete the RPC call
            responseObserver.onCompleted();

        }
    }

}
