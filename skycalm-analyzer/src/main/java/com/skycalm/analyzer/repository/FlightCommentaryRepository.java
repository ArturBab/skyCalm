package com.skycalm.analyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skycalm.analyzer.model.FlightCommentary;

@Repository
public interface FlightCommentaryRepository extends JpaRepository<FlightCommentary, Long> {

}
