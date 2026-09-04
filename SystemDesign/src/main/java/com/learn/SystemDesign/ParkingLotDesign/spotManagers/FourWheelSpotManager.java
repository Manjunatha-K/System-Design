package com.learn.SystemDesign.ParkingLotDesign.spotManagers;

import com.learn.SystemDesign.ParkingLotDesign.LookupStarategy.ParkingSpotLookupStrategy;
import com.learn.SystemDesign.ParkingLotDesign.entity.ParkingSpot;

import java.util.List;

public class FourWheelSpotManager extends ParkingSpotManager {


    public FourWheelSpotManager(List<ParkingSpot> spots, ParkingSpotLookupStrategy strategy) {
        super(spots, strategy);
    }
}
