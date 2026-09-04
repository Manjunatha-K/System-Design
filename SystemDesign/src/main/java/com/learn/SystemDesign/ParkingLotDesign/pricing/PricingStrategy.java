package com.learn.SystemDesign.ParkingLotDesign.pricing;

import com.learn.SystemDesign.ParkingLotDesign.Ticket;

public interface PricingStrategy {
    double calculate(Ticket ticket);
}
