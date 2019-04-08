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
import org.Muhammad.example.speaker.SpeakerActionRequest;
import org.Muhammad.example.speaker.SpeakerActionResponse;
import org.Muhammad.example.speaker.SpeakerFunction;
import org.Muhammad.example.speaker.SpeakerGrpc;
import org.Muhammad.example.speaker.SpeakerModeRequest;
import org.Muhammad.example.speaker.SpeakerModeResponse;
import serviceui.Printer;
import serviceui.ServiceUI;

/**
 *
 * @author asadmalik
 */
public class SpeakerServer {

    private static final Logger logger = Logger.getLogger(SpeakerServer.class.getName());

    /* The port on which the server should run */
    private int port = 50056;
    private Server server;
    private int speakerStatus = 0; // 0 is OFF; 1 is ON
    private int speakerVolume = 0;
    private boolean speakerMute = false;

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

        public void speakerMode(SpeakerModeRequest request, StreamObserver<SpeakerModeResponse> responseObserver) {

            SpeakerFunction speakerFunction = request.getSpeakerFunction();
            String speakerModeRequested;
            String speakerModePerformed = null;

            if (speakerStatus == 0) {
                speakerModePerformed = "Please turn on the speaker";
            } else if (speakerFunction.getVolumeUp() != null && !speakerFunction.getVolumeUp().equalsIgnoreCase("")) {
                speakerModeRequested = speakerFunction.getVolumeUp();
                ui.append(speakerModeRequested);
                if (speakerVolume < 100) {
                    speakerMute = false;
                    speakerVolume = speakerVolume + 10;
                    speakerModePerformed = "Volume is now : " + speakerVolume;
                } else if (speakerVolume >= 100) {
                    speakerModePerformed = "Volume already at maximum";
                }
            } else if (speakerFunction.getVolumeDown() != null && !speakerFunction.getVolumeDown().equalsIgnoreCase("")) {
                speakerModeRequested = speakerFunction.getVolumeDown();
                ui.append(speakerModeRequested);

                if (speakerVolume > 0) {
                    speakerMute = false;
                    speakerVolume = speakerVolume - 10;
                    speakerModePerformed = "Volume is now : " + speakerVolume;
                } else if (speakerVolume <= 0) {
                    speakerModePerformed = "Volume already at minimum";
                }
            } else if (speakerFunction.getMute() != null && !speakerFunction.getMute().equalsIgnoreCase("")) {
                speakerModeRequested = speakerFunction.getMute();
                ui.append(speakerModeRequested);
                if (speakerMute) {
                    speakerMute = false;
                    speakerModePerformed = "Speaker unmuted";
                } else {
                    speakerMute = true;
                    speakerModePerformed = "Speaker Muted";
                }
            }

            SpeakerModeResponse response = SpeakerModeResponse.newBuilder().setMode(speakerModePerformed)
                    .build();

            responseObserver.onNext(response);
            // complete the RPC call
            responseObserver.onCompleted();

        }

        public void speakerAction(SpeakerActionRequest request, StreamObserver<SpeakerActionResponse> responseObserver) {

            SpeakerFunction speakerFunction = request.getSpeakerFunction();
            String speakerActionRequested;
            String speakerActionPerformed = null;

            // turning speaker on
            if (speakerFunction.getSpeakerOn() != null && !speakerFunction.getSpeakerOn().equalsIgnoreCase("")) {
                speakerActionRequested = speakerFunction.getSpeakerOn();
                ui.append(speakerActionRequested);

                if (speakerStatus == 0) {
                    speakerActionPerformed = "Speaker turned on";
                    speakerStatus = 1;
                } else if (speakerStatus == 1) {
                    speakerActionPerformed = "Speaker already turned on";
                }

            } else if (speakerFunction.getSpeakerOff() != null && !speakerFunction.getSpeakerOff().equalsIgnoreCase("")) { // turning speaker off
                speakerActionRequested = speakerFunction.getSpeakerOff();
                ui.append(speakerActionRequested);

                if (speakerStatus == 1) {
                    speakerActionPerformed = "Speaker turned off";
                    speakerStatus = 0;
                } else if (speakerStatus == 0) {
                    speakerActionPerformed = "Speaker already off";
                }

            }
            SpeakerActionResponse response = SpeakerActionResponse.newBuilder().setAction(speakerActionPerformed)
                    .build();

            responseObserver.onNext(response);
            // complete the RPC call
            responseObserver.onCompleted();

        }

    }

}
