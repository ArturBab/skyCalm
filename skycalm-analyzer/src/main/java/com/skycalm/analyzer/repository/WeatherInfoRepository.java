package com.skycalm.analyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skycalm.analyzer.model.WeatherInfo;

@Repository
public interface WeatherInfoRepository extends JpaRepository<WeatherInfo, Long> {

}
