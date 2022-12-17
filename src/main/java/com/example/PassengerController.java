package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path = "api/passenger")
public class PassengerController {

    PassengerService myService;

    public PassengerController(PassengerService myService){
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

        return myService.getPassengerById(PassengerID);
    }

    @PostMapping("")
    public void savePassenger(
            @RequestBody Passenger passenger){
        myService.savePassenger(passenger);
    }

    @GetMapping("/name/{name}")
    public Passenger getPassengerName(@PathVariable("name") String name){
        return myService.findPassengersByName(name);
    }


}
