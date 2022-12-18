package com.example;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@Service
public class PassengerService {

    private final PassengerRepo passengerRepo;
    public List<Passenger> getAllPassengers() {

                return passengerRepo.findAll();
    }
    public Passenger getPassengerById(@PathVariable String PassengerID){

        Passenger myPassenger = new Passenger("Mr", "Peter", "1234567891", 24646464554L, 23);

        return myPassenger;
    }
    public void savePassenger(Passenger passenger){
        passengerRepo.save(passenger);
    }

    public Passenger findPassengersByName(String name){
        return passengerRepo.findPassengersByName(name);
    }

    public void deletePassenger(Long count){
        passengerRepo.deleteById(count);
    }

    //http:localhost:8080/api/passenger/age?age_start=16age_end=60
    public List<Passenger> findPassengerByAgeRange(int age, int age2){

        return passengerRepo.findPassengerByAgeRange(age, age2);
    }
}
