package com.skycalm.analyzer.service;

import com.skycalm.analyzer.analyzergrpc.AnalyzerServiceGrpc;

public class AnalyzerServiceImpl extends AnalyzerServiceGrpc.AnalyzerServiceImplBase {

    @Override
    public void analyzeFlight(
            com.skycalm.analyzer.analyzergrpc.RequestAirlineTicket request,
            io.grpc.stub.StreamObserver<com.skycalm.analyzer.analyzergrpc.AnalyzeFlightResponse> responseObserver) {

        // Простая заглушка
        var response = com.skycalm.analyzer.analyzergrpc.AnalyzeFlightResponse.newBuilder()
                .setSummary("Фиктивный анализ.")
                .setAdvice("Пока что заглушка.")
                .setCreatedAt(java.time.LocalDateTime.now().toString())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
