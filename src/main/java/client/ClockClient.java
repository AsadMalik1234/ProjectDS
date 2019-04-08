/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import clientui.ClockClientGUI;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.List;
import org.Muhammad.example.clock.ClockActionRequest;
import org.Muhammad.example.clock.ClockActionResponse;
import org.Muhammad.example.clock.ClockFunction;
import org.Muhammad.example.clock.ClockGrpc;

/**
 *
 * @author asadmalik
 */
public class ClockClient implements ServiceObserver{
    
        protected ClockClientGUI ui;
    private final String serviceType;
    private final String name;
        private ManagedChannel channel;
    protected ServiceDescription current;
    private ClockGrpc.ClockBlockingStub blockingStub;
    
    public ClockClient(){
        
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
    
    
        public void clockAction(String buttonName){
           ClockFunction clockFunction = ClockFunction.newBuilder()
                   .build();
           
           ClockActionRequest clockActionRequest = ClockActionRequest.newBuilder()
                   .build();
           
           ClockActionResponse clockActionResponse = blockingStub.clockAction(clockActionRequest);
        }
    

    public void switchService(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
      public static void main(String[] args) {
        new ClockClient();
    }
    
}
