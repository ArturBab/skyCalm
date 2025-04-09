package com.skycalm.analyzer.service;

import java.util.Map;

import com.skycalm.analyzer.grpc.FlightRequest;
import com.skycalm.analyzer.grpc.FlightResponse;
import com.skycalm.analyzer.grpc.FlightAnalyzerServiceGrpc;

import io.grpc.stub.StreamObserver;

public class FlightAnalyzerServiceImpl extends FlightAnalyzerServiceGrpc.FlightAnalyzerServiceImplBase {

    private final ExternalApiService apiService = new ExternalApiService();

    @Override
    public void analyzeFlight(FlightRequest request, StreamObserver<FlightResponse> responseObserver) {

        String flightNumber = request.getFlightNumber();
        String departureDate = request.getDepartureDate();

        System.out.println("Получен запрос: " + request.getFlightNumber() + " | " + request.getDepartureDate());

        Map<String, String> apiData = apiService.fetchFLightAnalysis(flightNumber, departureDate);

        FlightResponse response = FlightResponse.newBuilder()
                /*
                 * Пример пустой заглушки
                 * .setRouteSummary("Маршрут пока не определён")
                 * .setTurbulenceInfo("Нет данных")
                 * .setWeatherInfo("Без осадков")
                 * .setMessage("Запрос обработан успешно")
                 * .setRecommendation("Оставайтесь на связи")
                 */
                .setRouteSummary(apiData.get("routeSummary"))
                .setTurbulenceInfo(apiData.get("turbulenceInfo"))
                .setWeatherInfo(apiData.get("weatherInfo"))
                .setMessage(apiData.get("message"))
                .setRecommendation(apiData.get("recommendation"))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
