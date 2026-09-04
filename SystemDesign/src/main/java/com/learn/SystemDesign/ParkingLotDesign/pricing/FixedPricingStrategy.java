package com.learn.SystemDesign.ParkingLotDesign.pricing;

import com.learn.SystemDesign.ParkingLotDesign.Ticket;

public class FixedPricingStrategy implements PricingStrategy {

    @Override
    public double calculate(Ticket ticket) {
        return 100;
    }
}