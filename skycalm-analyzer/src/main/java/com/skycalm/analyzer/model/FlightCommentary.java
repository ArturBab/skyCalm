package com.skycalm.analyzer.model;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "flight_commentary")
public class FlightCommentary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "summary")
    private String summary;

    @Column(name = "advice")
    private String advice;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    // Связь 1:1 с AirlineTicket
    @OneToOne
    @JoinColumn(name = "ticket_id", nullable = false)
    private AirlineTicket airlineTicket;

    // Связь 1:1 с WeatherInfo (владелец - WeatherInfo)
    @OneToOne(mappedBy = "flightCommentary", cascade = CascadeType.ALL)
    private WeatherInfo weatherInfo;

    // Связь 1:1 с FlightInfo (владелец - FlightInfo)
    @OneToOne(mappedBy = "flightCommentary", cascade = CascadeType.ALL)
    private FlightInfo flightInfo;

    public FlightCommentary() {
    }

    public FlightCommentary(String summary, String advice, LocalDateTime createdAt) {
        this.summary = summary;
        this.advice = advice;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setAirlineTicket(AirlineTicket airlineTicket) {
        this.airlineTicket = airlineTicket;
    }    
}
