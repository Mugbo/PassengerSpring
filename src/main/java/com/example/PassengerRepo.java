package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
public interface PassengerRepo extends JpaRepository<Passenger, Long> {
    public  Passenger findPassengersByName(String name);
}
