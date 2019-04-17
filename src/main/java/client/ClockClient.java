/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import clientui.ClockClientGUI;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.Muhammad.example.clock.ClockActionResponse;
import org.Muhammad.example.clock.ClockGrpc;
import org.Muhammad.example.clock.ClockResetRequest;
import org.Muhammad.example.clock.ClockResetResponse;

/**
 *
 * @author asadmalik
 */
public class ClockClient implements ServiceObserver {

    protected ClockClientGUI ui;
    private final String serviceType;
    private final String name;
    private ManagedChannel channel;
    protected ServiceDescription current;
    private ClockGrpc.ClockBlockingStub blockingStub;
    private static final Logger logger = Logger.getLogger(ClockClient.class.getName());

    public ClockClient() {

        serviceType = "_Clock._udp.local.";
        name = "Clock";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ui = new ClockClientGUI(ClockClient.this);
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
        blockingStub = ClockGrpc.newBlockingStub(channel);

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

    public void clockAction() {
        try {

            new Thread() {
                public void run() {

                    Empty request = Empty.newBuilder().build();

                    Iterator<ClockActionResponse> response = blockingStub.clockAction(request);
                    while (response.hasNext()) {
                        ui.append("Clock Time: " + response.next().getClockTime() + "\n");
                    }
                }
            }.start();

        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
        }
    }

    public void resetClock() {
        
        ClockResetRequest clockResetRequest = ClockResetRequest.newBuilder().setClockResetRequest("Please reset clock").build();
        
        ClockResetResponse clockResetResponse = blockingStub.resetClock(clockResetRequest);
        
        System.out.println(clockResetResponse.getClockResetResponse());
        ui.append(clockResetResponse.getClockResetResponse());

    }

    public void switchService(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        new ClockClient();
    }

}
