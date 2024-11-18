package com.example.space.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.space.model.ParkingSpot;
import com.example.space.repository.ParkingSpotRepository;

@Service
public class ParkingSpotService {
    
    @Autowired
    ParkingSpotRepository repository;


    public List<ParkingSpot> getParkingSpots() {
        return repository.findAll();
    }

    public ParkingSpot getParkingSpot(int id) {
        return repository.findById(id).orElse(new ParkingSpot(0, "No Spot", null, 0));
    }

    public void createParkingSpot(ParkingSpot spot) {
        repository.save(spot);
    }

}
