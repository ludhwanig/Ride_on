package com.booking.ride_on;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.booking.ride_on")
@SpringBootApplication
public class RideOnApplication {

	public static void main(String[] args) {
		SpringApplication.run(RideOnApplication.class, args);
	}

}
