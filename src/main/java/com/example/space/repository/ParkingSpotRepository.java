package com.example.space.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.space.model.ParkingSpot;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, Integer> {}
