package com.skycalm.analyzer.service;

import java.util.HashMap;
import java.util.Map;

public class ExternalApiService {

    public Map<String, String> fetchFLightAnalysis(String flightNumber, String departureDate) {
        
        // Простая заглушка

        Map<String, String> data = new HashMap<>();
        
        data.put("routeSummary", "Москва -> Нью-Йорк");
        data.put("turbulenceInfo", "Средняя турбулентность");
        data.put("weatherInfo", "Переменная облачность");
        data.put("message", "Информация получена успешно");
        data.put("recommendation", "Выберите место у прохода");

        System.out.println(" Запрос к внешнему API (заглушка): " + flightNumber + ", " + departureDate);
        return data;
    }
}
