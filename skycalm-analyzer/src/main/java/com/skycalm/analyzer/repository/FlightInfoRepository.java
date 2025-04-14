package com.skycalm.analyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skycalm.analyzer.model.FlightInfo;

@Repository
public interface FlightInfoRepository extends JpaRepository<FlightInfo, Long> {

}
