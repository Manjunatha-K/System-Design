package com.learn.SystemDesign.ParkingLotDesign.parkingLot;

import com.learn.SystemDesign.ParkingLotDesign.Ticket;
import com.learn.SystemDesign.ParkingLotDesign.entity.Vehicle;

public class EntranceGate {
    public Ticket enter(ParkingBuilding building, Vehicle vehicle) {
        return building.allocate(vehicle);
    }
}
