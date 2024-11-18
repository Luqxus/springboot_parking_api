package com.example.space.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ParkingSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sessionId;

    private LocalDateTime entryTime;

    private LocalDateTime exitTime;

    @OneToOne
    @JoinColumn(name = "spot_id")
    private ParkingSpot parkingSpot;

    @OneToOne
    @JoinColumn(name = "entry_gate_id")
    private Gate entryGate;


    @OneToOne
    @JoinColumn(name = "exit_gate_id")
    @Nullable
    private Gate exitGate;

    private double amountCharged;

    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;

    private String status;
}
