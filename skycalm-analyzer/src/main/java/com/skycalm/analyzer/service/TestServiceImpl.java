package com.skycalm.analyzer.service;

import java.util.HashMap;
import java.util.Map;

import com.google.protobuf.Empty;
import com.skycalm.analyzer.grpc.Obj;
import com.skycalm.analyzer.grpc.ObjResponse;
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

    @Override
    public void pingWithNoParametrs(Empty reqEmpty, StreamObserver<TestMessageResponse> responseObserver) {

        TestMessageResponse response = TestMessageResponse.newBuilder()
                .setResponse("Вызов метода без параметров.")
                .build();

        System.out.println("Вызвался метод pingWithNoParametrs()");

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void postObject(Obj reqObj, StreamObserver<ObjResponse> responseOb) {

        // Получаем данные из обьекта по реквесту

        System.out.println("Получен объект:");
        System.out.println("  ID: " + reqObj.getId());
        System.out.println("  Имя: " + reqObj.getName());
        System.out.println("  Возраст: " + reqObj.getAge());
        System.out.println("  Статус: " + reqObj.getStatus());

        HashMap<String, Obj> list = new HashMap<String, Obj>();
        list.put("ПЕРВЫЙ ОБЬЕКТ -> ", reqObj);

        System.out.println("Содержимое HashMap:");

        System.out.println(reqObj.toString());

        TestMessageResponse message = TestMessageResponse.newBuilder()
                .setResponse("Объект получен успешно!")
                .build();

        ObjResponse response2 = ObjResponse.newBuilder()
                .setMessage(message)
                .setObj(reqObj)
                .build();

        responseOb.onNext(response2);
        responseOb.onCompleted();
    }
}
