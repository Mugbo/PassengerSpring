package com.example;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@Service
public class PassengerService {

    private final PassengerRepo passengerRepo;
    public List<Passenger> getAllPassengers() {

                return passengerRepo.findAll();
    }
    public Passenger getPassengerById(@PathVariable String PassengerID){

        Passenger myPassenger = new Passenger("Mr", "Peter", "1234567891", 24646464554L, 23, 1L);

        return myPassenger;
    }
    public void savePassenger(Passenger passenger){
        passengerRepo.save(passenger);
    }

    public Passenger findPassengersByName(String name){
        return passengerRepo.findPassengersByName(name);
    }


}
