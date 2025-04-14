package com.skycalm.analyzer.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "airline_ticket")
public class AirlineTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "departure_date")
    private LocalDate departureDate;

    @Column(name = "departure_time")
    private LocalTime departureTime;

    @Column(name = "from")
    private String from;

    @Column(name = "to")
    private String to;

    @Column(name = "airline")
    private String airline;

    @Column(name = "user_id")
    private Long userId;

    public AirlineTicket() {
    }

    public AirlineTicket(LocalDate departureDate, LocalTime departureTime, String from, String to, String airline,
            Long userId) {
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.from = from;
        this.to = to;
        this.airline = airline;
        this.userId = userId;
    }

    // Геттеры и сеттеры

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
