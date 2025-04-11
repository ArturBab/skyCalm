package com.skycalm.analyzer;

import java.io.IOException;

import com.skycalm.analyzer.service.AnalyzerServiceImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class AnalyzerServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 9090;

        Server gRPCServer = ServerBuilder
                .forPort(port)
                .addService(new AnalyzerServiceImpl())
                .build()
                .start();

        System.out.println("gRPC-сервер запущен на порту " + port);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Сервер выключается...");
            gRPCServer.shutdown();
        }));
        gRPCServer.awaitTermination();
    }
}
