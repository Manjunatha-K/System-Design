package com.learn.SystemDesign.ParkingLotDesign.pricing;

import com.learn.SystemDesign.ParkingLotDesign.Ticket;

public class CostComputation {

    private final PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double compute(Ticket ticket) {;

        return pricingStrategy.calculate(ticket);
    }
}