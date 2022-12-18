package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/passenger")
public class PassengerController {

    PassengerService myService;

    public PassengerController(PassengerService myService){
        this.myService = myService;
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
    @DeleteMapping("/delete/{count}")
    public void deletePassenger(@PathVariable("count") Long count){
        myService.deletePassenger(count);
    }

    @GetMapping("/age")
    public List<Passenger> getPassengerByAge(@RequestParam(name = "age_start") int age, @RequestParam(name = "age_end") int age2){

        return myService.findPassengerByAgeRange(age, age2);
    }

}
