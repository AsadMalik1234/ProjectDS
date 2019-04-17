/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import client.NightLightClient;
import client.ServiceDescription;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import io.grpc.stub.StreamObserver;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;
import org.Muhammad.example.NightLight.LightGrpc;
import org.Muhammad.example.NightLight.LightOffRequest;
import org.Muhammad.example.NightLight.LightOnRequest;
import org.Muhammad.example.NightLight.Lighting;
import org.Muhammad.example.clock.ClockActionResponse;
import org.Muhammad.example.clock.ClockGrpc;
import org.Muhammad.example.clock.ClockResetRequest;
import org.Muhammad.example.clock.ClockResetResponse;

import serviceui.Printer;
import serviceui.ServiceUI;

/**
 *
 * @author asadmalik
 */
public class ClockServer {

    private static final Logger logger = Logger.getLogger(ClockServer.class.getName());
    private LightGrpc.LightBlockingStub lightBlockingStub;
    private ManagedChannel channel;
    //NightLightClient nightLightClient = new NightLightClient();

    /* The port on which the server should run */
    private int port = 50059;
    private Server server;
    private int time = 0;

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
        ClockServer clockServer = new ClockServer();
        clockServer.serviceAdded();
        server.start();
        server.blockUntilShutdown();
    }

    public void serviceAdded() {
        System.out.println("service added");
        channel = ManagedChannelBuilder.forAddress("127.0.0.1", 50055)
                .usePlaintext(true)
                .build();
        lightBlockingStub = LightGrpc.newBlockingStub(channel);

    }

    private class ClockImpl extends ClockGrpc.ClockImplBase {

        private Printer ui;

        public ClockImpl() {
            String name = "Muhammad";
            String serviceType = "_Clock._udp.local.";
            ui = new ServiceUI(name + serviceType);
        }
                
        public void resetClock(ClockResetRequest request, StreamObserver<ClockResetResponse> responseObserver) {
            
            String resetRequest = request.getClockResetRequest();
            ui.append(resetRequest);
            time = 0;
            
            ClockResetResponse response = ClockResetResponse.newBuilder().setClockResetResponse("Clock Reset").build();

            responseObserver.onNext(response);

            // complete the RPC call
            responseObserver.onCompleted();
        }
        
        @Override
        public void clockAction(com.google.protobuf.Empty request, io.grpc.stub.StreamObserver<ClockActionResponse> responseObserver) {

            //nightLightClient.serviceAdded(new ServiceDescription("127.0.0.1", 50055));
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
                    ui.append("Clock Time: " + status.getClockTime() + "\n");
                    if (time == 18) {
                        //nightLightClient.lightOn();
//                        Lighting lighting = Lighting.newBuilder().setLightOn("Please Turn Light On").build();
//                        LightOnRequest lightOnRequest = LightOnRequest.newBuilder().setLighting(lighting).build();
//                        lightBlockingStub.lightOn(lightOnRequest);

                    } else if (time == 6) {
                        //nightLightClient.lightOff();
//                        Lighting lighting = Lighting.newBuilder().setLightOff("Please turn Light Off").build();
//                        LightOffRequest lightOffRequest = LightOffRequest.newBuilder().setLighting(lighting).build();
//                        lightBlockingStub.lightOff(lightOffRequest);

                    }
                    obj.onNext(status);
                    time += 1;
                } else {
                    time = 0;

                }
            }
        }

    }

}
