///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package services;
//
//import io.grpc.Server;
//import io.grpc.ServerBuilder;
//import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
//import io.grpc.stub.StreamObserver;
//import java.util.Timer;
//import java.util.logging.Logger;
//import org.Muhammad.example.Light.LightGrpc;
//import services.JmDNSRegistrationHelper;
//import serviceui.Printer;
//import serviceui.ServiceUI;
//import java.util.Timer;
//import java.util.TimerTask;
//import org.Muhammad.example.Light.LightStatus;
//
///**
// *
// * @author asadmalik
// */
//public class LightServer {
//    
//    private static final Logger logger = Logger.getLogger(LightServer.class.getName());
//
//    /* The port on which the server should run */
//    private int port = 50051;
//    private Server server;
//
//    private void start() throws Exception {
//        server = ServerBuilder.forPort(port)
//                .addService(new LightImpl())
//                .build()
//                .start();
//        logger.info("Server started, listening on " + port);
//        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Dominics", "_movie-recommender._udp.local.", "", port);
//
//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            @Override
//            public void run() {
//                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
//                System.err.println("*** shutting down gRPC server since JVM is shutting down");
//                LightServer.this.stop();
//                System.err.println("*** server shut down");
//            }
//        });
//    }
//
//    private void stop() {
//        if (server != null) {
//            server.shutdown();
//        }
//    }
//
//    /**
//     * Await termination on the main thread since the grpc library uses daemon
//     * threads.
//     */
//    private void blockUntilShutdown() throws InterruptedException {
//        if (server != null) {
//            server.awaitTermination();
//        }
//    }
//
//    /**
//     * Main launches the server from the command line.
//     */
//    public static void main(String[] args) throws Exception {
//        final LightServer server = new LightServer();
//        server.start();
//        server.blockUntilShutdown();
//    }
//    
//      private class LightImpl extends LightGrpc.LightImplBase {
//    
//  
//    private int lightStatus;
//    private boolean light;
//     private Printer ui;
//    
//    public LightImpl(){
//        String name = "Dominic's";
//        String serviceType = "_light._udp.local.";
//        ui = new ServiceUI(name + serviceType);
//                
//    }
//    
// 
//        public void lightOn(org.Muhammad.example.Light.LightActionRequest request,
//        io.grpc.stub.StreamObserver<org.Muhammad.example.Light.LightActionResponse> responseObserver) {
//    
//    }
//
//    /**
//     */
//    public void lightOff(org.Muhammad.example.Light.LightActionRequest request,
//        io.grpc.stub.StreamObserver<org.Muhammad.example.Light.LightActionResponse> responseObserver) {
//   
//    }
//
//          
//        
//        class RemindTask extends TimerTask {
//            
//             StreamObserver<LightStatus> o;
//
//            public RemindTask(StreamObserver<LightStatus> j) {
//                o = j;
//            }
//
//        @Override
//       public void run() {
//            if (light == true){
//                if (lightStatus == 0) {
//                    lightStatus += 1;
//                    light = false;
//                }
//                else if (lightStatus == 1){
//                    lightStatus -= 1;
//                    light = false;
//                }
//            }
//        }
//    }
//        
//    public String getStatus() {
//       switch (lightStatus) {
//            case 0:
//                return "Light is off";
//            case 1:
//                return "Light is on";
//            default:
//                return "Please wait";
//        }
//    }
//   
//    }
//
//       
//
//      }
//
//    
//    
