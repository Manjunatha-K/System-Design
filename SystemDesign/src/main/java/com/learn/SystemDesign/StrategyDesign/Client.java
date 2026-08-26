package com.learn.SystemDesign.StrategyDesign;

public class Client {
    public static void main(String[] args){
        System.out.println("CLIENT CODE");
        DriveStrategy normalDrive = new NormalDrive();
        DriveStrategy sportDrive = new SportDrive();
        DriveStrategy offRoadDrive = new OffRoadDrive();

        System.out.println("----------NORMAL VEHICLE----------");
        Vehicle normalVehicle = new NormalVehicle(normalDrive);
        normalVehicle.driveVehicle();
        System.out.println("----------SPORTS VEHICLE----------");
        Vehicle sportsVehicle = new SportsVehicle(sportDrive);
        sportsVehicle.driveVehicle();
        System.out.println("----------OFFROAD VEHICLE----------");
        Vehicle offRoadVehicle = new OffRoadVehicle(offRoadDrive);
        offRoadVehicle.driveVehicle();
    }
}
