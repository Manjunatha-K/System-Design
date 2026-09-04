package com.learn.SystemDesign.ParkingLotDesign.LookupStarategy;

import com.learn.SystemDesign.ParkingLotDesign.entity.ParkingSpot;

import java.util.List;

public interface ParkingSpotLookupStrategy {
    ParkingSpot selectSpot(List<ParkingSpot> spots);
}
