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

	PassengerService myService;

	public PassengerApplication(PassengerService myService){
		this.myService = myService;
	}
	public static void main(String[] args) {
		SpringApplication.run(PassengerApplication.class, args);
	}

	@GetMapping
	public List<Passenger> getAllPassengers() {

		return myService.getAllPassengers();
	}
	@GetMapping("/{PassengerID}")
	public Passenger getPassengerById(@PathVariable String PassengerID){

		Passenger myPassenger = new Passenger("Mr", "Peter", "1234567891", 24646464554L, 23);

		return myPassenger;
	}

}
