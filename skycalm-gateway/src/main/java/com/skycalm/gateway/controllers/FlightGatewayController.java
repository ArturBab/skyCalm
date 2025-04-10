package com.skycalm.gateway.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.skycalm.analyzer.grpc.FlightAnalyzerServiceGrpc;
import com.skycalm.analyzer.grpc.FlightRequest;
import com.skycalm.analyzer.grpc.FlightResponse;

import net.devh.boot.grpc.client.inject.GrpcClient;

//import net.devh.boot.grpc.client.inject.GrpcClient;

@RestController
@RequestMapping("/api/flights")
public class FlightGatewayController {

    @GrpcClient("flightAnalyzerService")
    private FlightAnalyzerServiceGrpc.FlightAnalyzerServiceBlockingStub flightAnalyzerService;

    @GetMapping("/analyze")
    public ResponseEntity<String> analyzerFlight(@RequestParam String flightNumber, @RequestParam String depatureDate) {

        // Создается gRPC-запрос
        FlightRequest request = FlightRequest.newBuilder()
                .setFlightNumber(flightNumber)
                .setDepartureDate(depatureDate)
                .build();

        // Отправляется запрос
        FlightResponse response = flightAnalyzerService.analyzeFlight(request); 
        
        // Формируется ответ для REST клиента
        String result = String.format(
            "\nRoute: " + response.getRouteSummary() + "|| "
            + "\nTurbulence: " + response.getTurbulenceInfo() + "|| "
            + "\nWeather: " + response.getWeatherInfo()
        );

        return ResponseEntity.ok(result);
    }
}
