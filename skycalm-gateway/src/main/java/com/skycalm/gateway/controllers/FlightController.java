package com.skycalm.gateway.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FlightController {
    
    @GetMapping("/status")
    @ResponseBody // Без этой аннотации вылезет ошибка Whitelabel Error Page
    public String flightStatus() {
        return "SkyCalm Gateway работает. Всё стабильно";
    }
}
