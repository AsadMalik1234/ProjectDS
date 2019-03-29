/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.asad.examples.greet;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.util.logging.Logger;
import io.grpc.stub.StreamObserver;
import java.io.IOException;



/**
 *
 * @author asadmalik
 */


public class GreetingServer {

  private static final Logger logger = Logger.getLogger(GreetingServer.class.getName());

  private Server server;

  private void start() throws IOException {
    /* The port on which the server should run */
    int port = 50052;
    server = ServerBuilder.forPort(port)
        .addService(new GreetServiceImpl())
        .build()
        .start();
    logger.info("Server started, listening on " + port);
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
        System.err.println("*** shutting down gRPC server since JVM is shutting down");
        GreetingServer.this.stop();
        System.err.println("*** server shut down");
      }
    });
  }

  private void stop() {
    if (server != null) {
      server.shutdown();
    }
  }

  /**
  * Await termination on the main thread since the grpc library uses daemon threads.
  */
  private void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      server.awaitTermination();
    }
  }

  /**
  * Main launches the server from the command line.
  */
  public static void main(String[] args) throws IOException, InterruptedException {
    final GreetingServer server = new GreetingServer();
    server.start();
    server.blockUntilShutdown();
  }

//*****************************************************************************************************
    

      
      
public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {


//******************************* Unary  ***********************************************************
    
    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        // extract the fields we need
        Greeting greeting = request.getGreeting();
        String firstName = greeting.getFirstName();
        String lastName = greeting.getLastName();

        // create the response
        String result = "Hello " + firstName + lastName;
        GreetResponse response = GreetResponse.newBuilder()
                .setResult(result)
                .build();
        
      
        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
        }
        
}

}