package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path = "api/passenger")
public class PassengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerApplication.class, args);
	}

	@GetMapping
	public List<Passenger> getAllPassengers() {

		List<Passenger> myPassengers = List.of(

				new Passenger("Mr", "Peter", "1234567891", 24646464554L, 23),
				new Passenger("Mr", "Patrick", "1234567891", 244235525514L, 93),
				new Passenger("Mr", "Chris", "1234567891",1556255412585L, 53));

		return myPassengers;
	}
	@GetMapping("/{PassengerID}")
	public Passenger getPassengerById(@PathVariable String PassengerID){

		Passenger myPassenger = new Passenger("Mr", "Peter", "1234567891", 24646464554L, 23);

		return myPassenger;
	}

}
