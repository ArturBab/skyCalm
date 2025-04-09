package com.skycalm.analyzer;

import com.skycalm.analyzer.grpc.TestMessageRequest;
import com.skycalm.analyzer.grpc.TestMessageResponse;
import com.skycalm.analyzer.grpc.TestServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class TestServiceClient {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 9091)
                .usePlaintext()
                .build();

        TestServiceGrpc.TestServiceBlockingStub stub = TestServiceGrpc.newBlockingStub(channel);

        /*
         * TestMessageRequest request = TestMessageRequest.newBuilder()
         * .setText("Привет, тестовый сервер!")
         * .build();
         * 
         * TestMessageResponse response = stub.test(request);
         * System.out.println("Ответ от сервера: " + response.getResponse());
         */
        TestMessageRequest newRequest = TestMessageRequest.newBuilder()
                .setText("Привет снова")
                .build();

        TestMessageResponse newResponse = stub.sendText(newRequest);
        System.out.println("Ответ от сервера: " + newResponse.getResponse());
        channel.shutdown();
    }
}
