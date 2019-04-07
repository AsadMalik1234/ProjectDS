/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;
import org.Muhammad.example.NightLight.LightGrpc;
import org.Muhammad.example.NightLight.LightOffRequest;
import org.Muhammad.example.NightLight.LightOffResponse;
import org.Muhammad.example.NightLight.LightOnRequest;
import org.Muhammad.example.NightLight.LightOnResponse;
import org.Muhammad.example.NightLight.Lighting;
import serviceui.Printer;
import serviceui.ServiceUI;

/**
 *
 * @author asadmalik
 */
public class NightLightServer {

    private static final Logger logger = Logger.getLogger(NightLightServer.class.getName());

    /* The port on which the server should run */
    private int port = 50055;
    private Server server;
    private int lightStatus = 0;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new LightImpl())
                .build()
                .start();
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Muhammad", "_Light._udp.local.", "", port);
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                NightLightServer.this.stop();
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
        final NightLightServer server = new NightLightServer();
        server.start();
        server.blockUntilShutdown();
    }

    private class LightImpl extends LightGrpc.LightImplBase {

        private Printer ui;

        public LightImpl() {
            String name = "Muhammad";
            String serviceType = "_Light._udp.local.";
            ui = new ServiceUI(name + serviceType);
        }

        public void lightOn(LightOnRequest request, StreamObserver<LightOnResponse> responseObserver) {

            Lighting lighting = request.getLighting();
            String lightActionRequested = lighting.getLightOn();
            ui.append(lightActionRequested);
            String lightstatus;
            if(lightStatus == 0){
                lightStatus=1; //Light is on
                lightstatus = "Light Turned On";
            }else{
                lightstatus = "Light already On";
            }
            
            LightOnResponse response = LightOnResponse.newBuilder()
                    .setLightstatus(lightstatus)
                    .build();

            responseObserver.onNext(response);

            // complete the RPC call
            responseObserver.onCompleted();

        }

        /**
         */
        public void lightOff(LightOffRequest request, StreamObserver<LightOffResponse> responseObserver) {

            Lighting lighting = request.getLighting();
            String lightActionRequested = lighting.getLightOff();
            ui.append(lightActionRequested);
            String lightstatus;
            if(lightStatus == 1){
                lightStatus=0; //Light is off
                lightstatus = "Light Turned off";
            }else{
                lightstatus = "Light already off";
            }

            LightOffResponse response = LightOffResponse.newBuilder()
                    .setLightstatus(lightstatus)
                    .build();

            responseObserver.onNext(response);

            // complete the RPC call
            responseObserver.onCompleted();

        }
        

    }

}
