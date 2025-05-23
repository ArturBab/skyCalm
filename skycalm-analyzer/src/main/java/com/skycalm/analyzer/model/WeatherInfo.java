package com.skycalm.analyzer.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "weather_info")
public class WeatherInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "condition")
    private String condition;

    @Column(name = "temperature")
    private float temperature;

    @Column(name = "windSpeed")
    private float windSpeed;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    // Связь 1:1 с Commentary
    @OneToOne
    @JoinColumn(name = "flight_commentary_id", nullable = false)
    private FlightCommentary flightCommentary;

    public WeatherInfo() {
    }

    public WeatherInfo(String condition, float temperature, float windSpeed, LocalDateTime createdAt) {
        this.condition = condition;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
