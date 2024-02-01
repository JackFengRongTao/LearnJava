package com.frt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrtApplication {
	private static final Logger log = LoggerFactory.getLogger(FrtApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FrtApplication.class, args);
	}
}
