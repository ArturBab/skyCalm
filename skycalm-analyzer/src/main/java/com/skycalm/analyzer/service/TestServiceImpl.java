package com.skycalm.analyzer.service;

import com.skycalm.analyzer.grpc.TestMessageRequest;
import com.skycalm.analyzer.grpc.TestMessageResponse;
import com.skycalm.analyzer.grpc.TestServiceGrpc;

import io.grpc.stub.StreamObserver;

public class TestServiceImpl extends TestServiceGrpc.TestServiceImplBase {

    @Override
    public void test(TestMessageRequest testRequest, StreamObserver<TestMessageResponse> streamObservertrTestResponse) {

        TestMessageResponse response = TestMessageResponse.newBuilder()
                .setResponse("SOOBCHENIYE!")
                .build();

        System.out.println("Вызвался метод test()");

        streamObservertrTestResponse.onNext(response);
        streamObservertrTestResponse.onCompleted();
    }

    @Override
    public void sendText(TestMessageRequest request, StreamObserver<TestMessageResponse> response) {

        String fromMyTextRequest = request.getText(); // получаем текст от клиента

        // Сервер говорит

        TestMessageResponse resp = TestMessageResponse.newBuilder()
                .setResponse("Привет от gRPC-сервера и так же то, что ты отправил в реквесте -> " + fromMyTextRequest)
                .build();

        System.out.println("Вызвался метод sendTest()");

        response.onNext(resp); // Отправляет ответ
        response.onCompleted(); // Завершает
    }
}
