/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import clientui.TvClientGUI;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.Muhammad.example.tv.TvChannelRequest;
import org.Muhammad.example.tv.TvChannelResponse;
import org.Muhammad.example.tv.TvFunction;
import org.Muhammad.example.tv.TvGrpc;
import org.Muhammad.example.tv.TvModeRequest;
import org.Muhammad.example.tv.TvModeResponse;

/**
 *
 * @author asadmalik
 */
public class TvClient implements ServiceObserver {

    protected TvClientGUI ui;
    private final String serviceType;
    private final String name;
    private ManagedChannel channel;
    protected ServiceDescription current;
    private TvGrpc.TvBlockingStub blockingStub;

    public TvClient() {

        serviceType = "_Tv._udp.local.";
        name = "Clock";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ui = new TvClientGUI(TvClient.this);
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
        blockingStub = TvGrpc.newBlockingStub(channel);

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

    
    
    public void tvMode(String buttonName){
      TvFunction tvFunction = TvFunction.newBuilder()
              .build();
      
      TvModeRequest tvModeRequest = TvModeRequest.newBuilder()
      .build();
      
      TvModeResponse tvModeResponse = blockingStub.tvMode(tvModeRequest);
  
       
    }
    public void tvChannel(){
          TvFunction tvFunction = TvFunction.newBuilder()
              .build();
          
           TvChannelRequest tvChannelRequest = TvChannelRequest.newBuilder()
      .build();
      
      TvChannelResponse tvChannelResponse = blockingStub.tvChannel(tvChannelRequest);
           
        
    }

    public void switchService(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        new TvClient();
    }
}
