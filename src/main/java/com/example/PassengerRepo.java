package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PassengerRepo extends JpaRepository<Passenger, Long> {
    public  Passenger findPassengersByName(String name);

    @Query("SELECT p FROM Passenger p WHERE p.age > ?1 and p.age < ?2")
    public List<Passenger> findPassengerByAgeRange(int age, int age2);
}
