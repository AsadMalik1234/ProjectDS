/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.asad.examples.greet;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;




/**
 *
 * @author asadmalik
 */
public class GreetingClient {
    
    
public static void main(String[] args)  {
        System.out.println("Hello I'm a gRPC client");

        GreetingClient main = new GreetingClient();
        main.run();
    }

    private void run() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();


        // With server authentication SSL/TLS; custom CA root certificates; not on Android
//        ManagedChannel secureChannel = NettyChannelBuilder.forAddress("localhost", 50051)
//                .sslContext(GrpcSslContexts.forClient().trustManager(new File("ssl/ca.crt")).build())
//                .build();

        doUnaryCall(channel);

       //doServerStreamingCall(channel);

        //doClientStreamingCall(channel);

        //doBiDiStreamingCall(channel);

        //doUnaryCallWithDeadline(channel);

        //doUnaryCall(secureChannel);

        System.out.println("Shutting down channel");
        channel.shutdown();

    }
    

//****************************************************************************************************************************************    

//******************************* Unary  ***********************************************************
    
        private void doUnaryCall(ManagedChannel channel) {
        // created a greet service client (blocking - synchronous)
        GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);

        // Unary
        // created a protocol buffer greeting message
        Greeting greeting = Greeting.newBuilder()
                .setFirstName("Asad")
                .build();

        // do the same for a GreetRequest
        GreetRequest greetRequest = GreetRequest.newBuilder()
                .setGreeting(greeting)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
        GreetResponse greetResponse = greetClient.greet(greetRequest);

        System.out.println(greetResponse.getResult());

    }
    
}
