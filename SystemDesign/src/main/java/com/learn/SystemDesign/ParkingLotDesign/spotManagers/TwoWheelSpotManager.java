package com.learn.SystemDesign.ParkingLotDesign.spotManagers;

import com.learn.SystemDesign.ParkingLotDesign.LookupStarategy.ParkingSpotLookupStrategy;
import com.learn.SystemDesign.ParkingLotDesign.entity.ParkingSpot;

import java.util.List;

public class TwoWheelSpotManager extends ParkingSpotManager {


    public  TwoWheelSpotManager(List<ParkingSpot> spots, ParkingSpotLookupStrategy strategy) {
        super(spots, strategy);
    }
}