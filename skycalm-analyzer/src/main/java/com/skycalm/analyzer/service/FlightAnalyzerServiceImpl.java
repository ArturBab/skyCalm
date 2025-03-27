package com.skycalm.analyzer.service;

import net.devh.boot.grpc.server.service.GrpcService;
import com.skycalm.analyzer.grpc.FlightAnalyzerServiceGrpc;
import com.skycalm.analyzer.grpc.FlightRequest;
import com.skycalm.analyzer.grpc.FlightResponse;

import io.grpc.stub.StreamObserver;

@GrpcService
public class FlightAnalyzerServiceImpl extends FlightAnalyzerServiceGrpc {

    @Override
    public void analyzeFlight(FlightRequest request, StreamObserver<FlightResponse> responseObserver) {

    }
}
