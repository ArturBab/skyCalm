package com.skycalm.analyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skycalm.analyzer.model.AirlineTicket;

@Repository
public interface AirlineTicketRepository extends JpaRepository<AirlineTicket, Long> {

}