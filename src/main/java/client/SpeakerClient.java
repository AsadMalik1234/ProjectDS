/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import clientui.SpeakerClientGUI;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.Muhammad.example.speaker.SpeakerActionRequest;
import org.Muhammad.example.speaker.SpeakerActionResponse;
import org.Muhammad.example.speaker.SpeakerFunction;
import org.Muhammad.example.speaker.SpeakerGrpc;
import org.Muhammad.example.speaker.SpeakerModeRequest;
import org.Muhammad.example.speaker.SpeakerModeResponse;

/**
 *
 * @author asadmalik
 */
public class SpeakerClient implements ServiceObserver {

    protected SpeakerClientGUI ui;
    private final String serviceType;
    private final String name;
    private ManagedChannel channel;
    protected ServiceDescription current;
    private SpeakerGrpc.SpeakerBlockingStub blockingStub;

    public SpeakerClient() {

        serviceType = "_Speaker._udp.local.";
        name = "Speaker";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ui = new SpeakerClientGUI(SpeakerClient.this);
                ui.setVisible(true);
            }
        });
    }

    String getServiceType() {
        return serviceType;
    }

    void disable() {
        // no services exist for this client type
    }

    public List<String> serviceInterests() {
        List<String> interests = new ArrayList<String>();
        interests.add(serviceType);
        return interests;
    }

    public void serviceAdded(ServiceDescription service) {
        System.out.println("service added");
        current = service;
        channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
                .usePlaintext(true)
                .build();
        blockingStub = SpeakerGrpc.newBlockingStub(channel);
    }

    public boolean interested(String type) {
        return serviceType.equals(type);
    }

    public String getName() {
        return name;
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void speakerMode(String buttonName) {

        SpeakerFunction speakerFunction = null;

        if ("VolumeUp".equalsIgnoreCase(buttonName)) {
            speakerFunction = SpeakerFunction.newBuilder().setVolumeUp("Turn volume up")
                    .build();

        } else if ("VolumeDown".equalsIgnoreCase(buttonName)) {
            speakerFunction = SpeakerFunction.newBuilder().setVolumeDown("Turn volume down")
                    .build();

        } else if ("Mute".equalsIgnoreCase(buttonName)) {
            speakerFunction = SpeakerFunction.newBuilder().setMute("Please mute")
                    .build();
        }

        SpeakerModeRequest speakerModeRequest = SpeakerModeRequest.newBuilder().setSpeakerFunction(speakerFunction)
                .build();

        SpeakerModeResponse SpeakerModeResponse = blockingStub.speakerMode(speakerModeRequest);

        System.out.println(SpeakerModeResponse.getMode());
        ui.append(SpeakerModeResponse.getMode());

    }

    //Method for turning speaker on/off
    public void speakerAction(String buttonName) {

        SpeakerFunction speakerFunction = null;

        if ("SpeakerOn".equalsIgnoreCase(buttonName)) {
            speakerFunction = SpeakerFunction.newBuilder().setSpeakerOn("Please turn the speaker on")
                    .build();
        } else if ("SpeakerOff".equalsIgnoreCase(buttonName)) {
            speakerFunction = SpeakerFunction.newBuilder().setSpeakerOff("Please turn the speaker off")
                    .build();
        }

        SpeakerActionRequest speakerActionRequest = SpeakerActionRequest.newBuilder().setSpeakerFunction(speakerFunction)
                .build();

        SpeakerActionResponse SpeakerActionResponse = blockingStub.speakerAction(speakerActionRequest);

        System.out.println(SpeakerActionResponse.getAction());
        ui.append(SpeakerActionResponse.getAction());

    }

    public void switchService(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        new SpeakerClient();
    }

}
