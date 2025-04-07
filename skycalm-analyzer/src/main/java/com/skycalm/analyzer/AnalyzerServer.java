package com.skycalm.analyzer;

import java.io.IOException;

import com.skycalm.analyzer.service.FlightAnalyzerServiceImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class AnalyzerServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Server server = ServerBuilder
        .forPort(9090)
        .addService(new FlightAnalyzerServiceImpl())
        .build();

        System.out.println("gRPC-сервер запущен на порту 9090");
        server.start();
        server.awaitTermination();
    }
}
