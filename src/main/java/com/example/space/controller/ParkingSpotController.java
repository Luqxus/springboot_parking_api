package com.example.space.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.space.model.ParkingSpot;
import com.example.space.service.ParkingSpotService;

@RestController
public class ParkingSpotController {
    
    @Autowired
    private ParkingSpotService service;

    @GetMapping("/spots")
    List<ParkingSpot> getParkingSpots() {
        return service.getParkingSpots();
    }

    @GetMapping("/spots/{id}")
    ParkingSpot getParkingSpot(@PathVariable int id) {
        return service.getParkingSpot(id);
    }

    @PostMapping("/spots")
    void createParkingSpot(@RequestBody ParkingSpot spot) {
        service.createParkingSpot(spot);
    } 
}
