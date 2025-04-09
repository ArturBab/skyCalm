package com.skycalm.analyzer;

import java.io.IOException;
import java.util.Scanner;

import org.checkerframework.checker.units.qual.s;

import com.skycalm.analyzer.service.FlightAnalyzerServiceImpl;
import com.skycalm.analyzer.service.TestServiceImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class AnalyzerServer {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 — FlightAnalyzerService (9090)");
        System.out.println("2 — TestService (9091)");
        System.out.println("3 — Оба сервиса");

        String choise = scanner.nextLine().strip().trim();

        Server flightServer = null;
        Server testServer = null;

        switch (choise) {
            case "1":
                flightServer = ServerBuilder.forPort(9090)
                        .addService(new FlightAnalyzerServiceImpl())
                        .build()
                        .start();
                System.out.println("FlightAnalyzerService запущен на порту 9090");
                break;
            case "2":
                testServer = ServerBuilder.forPort(9091)
                        .addService(new TestServiceImpl())
                        .build()
                        .start();
                System.out.println("TestService запущен на порту 9091");
                break;
            case "3":
                flightServer = ServerBuilder.forPort(9090)
                        .addService(new FlightAnalyzerServiceImpl())
                        .build()
                        .start();
                System.out.println("FlightAnalyzerService запущен на 9090");

                testServer = ServerBuilder.forPort(9091)
                        .addService(new TestServiceImpl())
                        .build()
                        .start();
                System.out.println("TestService запущен на 9091");
                break;
            default:
                System.out.println("Неверный выбор. Завершаем работу.");
                return;
        }
        System.out.println("gRPC-сервер работает.");
        if (flightServer != null) {
            flightServer.awaitTermination();
        }
        if (testServer != null) {
            testServer.awaitTermination();
        }
    }
}
