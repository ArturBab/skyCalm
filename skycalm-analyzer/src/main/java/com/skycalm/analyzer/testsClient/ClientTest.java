package com.skycalm.analyzer.testsClient;

import com.skycalm.analyzer.analyzergrpc.AnalyzerServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ClientTest {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        AnalyzerServiceGrpc.AnalyzerServiceBlockingStub stub = AnalyzerServiceGrpc.newBlockingStub(channel);

        com.skycalm.analyzer.analyzergrpc.RequestAirlineTicket requestAirlineTicket;

        requestAirlineTicket = com.skycalm.analyzer.analyzergrpc.RequestAirlineTicket.newBuilder()
                .setDepartureDate("2025-04-11")
                .setDepartureTime("15:30")
                .setFrom("Shymkent")
                .setTo("Moscow")
                .setAirline("SCAT")
                .build();

        com.skycalm.analyzer.analyzergrpc.AnalyzeFlightResponse response = stub.analyzeFlight(requestAirlineTicket);

        System.out.println("Резюме: " + response.getSummary());
        System.out.println("Совет: " + response.getAdvice());
        System.out.println("Создано: " + response.getCreatedAt());
    }
}
