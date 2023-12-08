package com.designpatterns.strategy;

public class OffRoadVehicle extends Vehicle{



    public OffRoadVehicle() {
        super(new SpecialDrive());
    }
}



