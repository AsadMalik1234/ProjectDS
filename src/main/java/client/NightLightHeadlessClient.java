/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import clientui.NightLightClientGUI;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.Muhammad.example.NightLight.ChangeColourRequest;
import org.Muhammad.example.NightLight.ChangeColourResponse;
import org.Muhammad.example.NightLight.LightGrpc;
import org.Muhammad.example.NightLight.LightOffRequest;
import org.Muhammad.example.NightLight.LightOffResponse;
import org.Muhammad.example.NightLight.LightOnRequest;
import org.Muhammad.example.NightLight.LightOnResponse;
import org.Muhammad.example.NightLight.Lighting;

/**
 *
 * @author asadmalik
 */
public class NightLightHeadlessClient implements ServiceObserver {

    private final String serviceType;
    private final String name;
    private ManagedChannel channel;
    protected ServiceDescription current;
    private LightGrpc.LightBlockingStub blockingStub;

    public NightLightHeadlessClient() {

        serviceType = "_Light._udp.local.";
        name = "Light";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        //serviceAdded(new ServiceDescription("18.188.112.9", 50055));

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
        blockingStub = LightGrpc.newBlockingStub(channel);

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

    public void lightOn() {

        Lighting lighting = Lighting.newBuilder()
                .setLightOn("Please Turn Light On")
                .build();

        LightOnRequest lightOnRequest = LightOnRequest.newBuilder()
                .setLighting(lighting)
                .build();

        LightOnResponse LightOnResponse = blockingStub.lightOn(lightOnRequest);
        System.out.println(LightOnResponse.getLightstatus());

    }

    public void lightOff() {

        Lighting lighting = Lighting.newBuilder()
                .setLightOff("Please turn Light Off")
                .build();

        LightOffRequest lightOffRequest = LightOffRequest.newBuilder()
                .setLighting(lighting)
                .build();

        LightOffResponse LightOffResponse = blockingStub.lightOff(lightOffRequest);
        System.out.println(LightOffResponse.getLightstatus());

    }

    public void changeColour() {
        Lighting lighting = Lighting.newBuilder().setChangeColour("Please change light color").build();

        ChangeColourRequest changeColourRequest = ChangeColourRequest.newBuilder().setLighting(lighting).build();

        ChangeColourResponse changeColourResponse = blockingStub.changeColour(changeColourRequest);
        System.out.println(changeColourResponse.getChangecolour());
    }

    public void switchService(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        new NightLightHeadlessClient();
    }

}
