package com.skycalm.analyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkycalmAnalyzerApplication {

	public static void main(String[] args) {
		System.out.println(">>> SkyCalm Analyzer is starting...");
		SpringApplication.run(SkycalmAnalyzerApplication.class, args);
	}

}
