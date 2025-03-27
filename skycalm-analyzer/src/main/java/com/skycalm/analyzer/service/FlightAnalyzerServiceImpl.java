package com.skycalm.analyzer.service;

import net.devh.boot.grpc.server.service.GrpcService;
import com.skycalm.analyzer.grpc.FlightAnalyzerServiceGrpc;
import com.skycalm.analyzer.grpc.FlightRequest;
import com.skycalm.analyzer.grpc.FlightResponse;

import io.grpc.stub.StreamObserver;

@GrpcService
public class FlightAnalyzerServiceImpl extends FlightAnalyzerServiceGrpc.FlightAnalyzerServiceImplBase {

    @Override
    public void analyzeFlight(FlightRequest request, StreamObserver<FlightResponse> responseObserver) {

        /* Простая заглушка */

        String flightNumber = request.getFlightNumber();
        String departureDate = request.getDepartureDate();

        FlightResponse response = FlightResponse.newBuilder()
                .setRouteSummary("Route for flight " + flightNumber + " on " + departureDate)
                .setTurbulenceInfo("Low turbulence expected")
                .setWeatherInfo("Sunny with a chance of coding")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
