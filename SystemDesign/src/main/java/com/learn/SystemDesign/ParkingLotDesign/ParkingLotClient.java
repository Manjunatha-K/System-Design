package com.learn.SystemDesign.ParkingLotDesign;

import com.learn.SystemDesign.ParkingLotDesign.LookupStarategy.ParkingSpotLookupStrategy;
import com.learn.SystemDesign.ParkingLotDesign.LookupStarategy.RandomLookupStrategy;
import com.learn.SystemDesign.ParkingLotDesign.entity.ParkingSpot;
import com.learn.SystemDesign.ParkingLotDesign.entity.Vehicle;
import com.learn.SystemDesign.ParkingLotDesign.enums.VehicleType;
import com.learn.SystemDesign.ParkingLotDesign.parkingLot.*;
import com.learn.SystemDesign.ParkingLotDesign.payment.CashPayment;
import com.learn.SystemDesign.ParkingLotDesign.payment.UPIPayment;
import com.learn.SystemDesign.ParkingLotDesign.pricing.CostComputation;
import com.learn.SystemDesign.ParkingLotDesign.pricing.FixedPricingStrategy;
import com.learn.SystemDesign.ParkingLotDesign.spotManagers.FourWheelSpotManager;
import com.learn.SystemDesign.ParkingLotDesign.spotManagers.ParkingSpotManager;
import com.learn.SystemDesign.ParkingLotDesign.spotManagers.TwoWheelSpotManager;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotClient {

    public static void main(String[] args) {

        ParkingSpotLookupStrategy strategy = new RandomLookupStrategy();

        Map<VehicleType, ParkingSpotManager> levelOneManagers = new HashMap<>();
        levelOneManagers.put(VehicleType.TWO_WHEELER,
                new TwoWheelSpotManager(List.of(new ParkingSpot("L1-S1"),
                        new ParkingSpot("L1-S2")), strategy));

        levelOneManagers.put(VehicleType.FOUR_WHEELER,
                new FourWheelSpotManager(List.of(new ParkingSpot("L1-S3")), strategy));

        ParkingLevel level1 = new ParkingLevel(
                1, levelOneManagers
        );

        Map<VehicleType, ParkingSpotManager> levelTwoManagers = new HashMap<>();
        levelTwoManagers.put(VehicleType.TWO_WHEELER,
                new TwoWheelSpotManager(List.of(new ParkingSpot("L2-S1")), strategy));

        levelTwoManagers.put(VehicleType.FOUR_WHEELER,
                new FourWheelSpotManager(List.of(new ParkingSpot("L2-S2"),
                        new ParkingSpot("L2-S3")), strategy));


        ParkingLevel level2 = new ParkingLevel(
                2, levelTwoManagers
        );

        ParkingBuilding parkingBuilding =
                new ParkingBuilding(
                        List.of(level1, level2),
                        new CostComputation(new FixedPricingStrategy())
                );

        ParkingLot parkingLot = new ParkingLot(
                parkingBuilding,
                new EntranceGate(),
                new ExitGate(new CostComputation(new FixedPricingStrategy()))
        );


        Vehicle bike = new Vehicle("BIKE-101", VehicleType.TWO_WHEELER);
        Vehicle car = new Vehicle("CAR-201", VehicleType.FOUR_WHEELER);

        Ticket t1 = parkingLot.vehicleArrives(bike);
        Ticket t2 = parkingLot.vehicleArrives(car);

        parkingLot.vehicleExits(t1, new CashPayment());
        parkingLot.vehicleExits(t2, new UPIPayment());
    }
}

