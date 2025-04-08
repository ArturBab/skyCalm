package com.skycalm.analyzer;

import com.skycalm.analyzer.grpc.FlightAnalyzerServiceGrpc;
import com.skycalm.analyzer.grpc.FlightRequest;
import com.skycalm.analyzer.grpc.FlightResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AnalyzerClient {

    public static void main(String[] args) {

        // 1. Подключаемся к gRPC-серверу
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        // 2. Создаём blocking stub — синхронный клиент
        FlightAnalyzerServiceGrpc.FlightAnalyzerServiceBlockingStub stub = FlightAnalyzerServiceGrpc
                .newBlockingStub(channel);

        // 3. Создаём запрос
        FlightRequest request = FlightRequest.newBuilder()
                .setFlightNumber("SU100")
                .setDepartureDate("2025-04-10")
                .build();

        // 4. Отправляем запрос и получаем ответ
        FlightResponse response = stub.analyzeFlight(request);

        // 5. Выводим результат
        System.out.println("Ответ от gRPC-сервера:");
        System.out.println("Маршрут:       " + response.getRouteSummary());
        System.out.println("Погода:        " + response.getWeatherInfo());
        System.out.println("Турбулентность:" + response.getTurbulenceInfo());
        System.out.println("Сообщение:     " + response.getMessage());
        System.out.println("Рекомендация:  " + response.getRecommendation());

        // 6. Закрываем соединение
        channel.shutdown();
    }
}
