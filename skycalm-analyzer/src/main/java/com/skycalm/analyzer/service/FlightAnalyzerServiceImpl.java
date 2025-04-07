package com.skycalm.analyzer.service;

import com.skycalm.analyzer.grpc.FlightRequest;
import com.skycalm.analyzer.grpc.FlightResponse;
import com.skycalm.analyzer.grpc.FlightAnalyzerServiceGrpc.FlightAnalyzerServiceImplBase;

import io.grpc.stub.StreamObserver;


public class FlightAnalyzerServiceImpl extends FlightAnalyzerServiceImplBase {
    
    @Override
    public void analyzeFlight(FlightRequest request, StreamObserver<FlightResponse> responseObserver) {

        // Простая заглушка
        System.out.println("Получен запрос: " + request.getFlightNumber() + " | " + request.getDepartureDate());

        FlightResponse response = FlightResponse.newBuilder()
            .setRouteSummary("Маршрут пока не определён")
            .setTurbulenceInfo("Нет данных")
            .setWeatherInfo("Без осадков")
            .setMessage("Запрос обработан успешно")
            .setRecommendation("Оставайтесь на связи")
            .build();
     
        responseObserver.onNext(response);
        responseObserver.onCompleted();            
    }
}
