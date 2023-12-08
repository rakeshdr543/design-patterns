package com.designpatterns.strategy;

public class SportVehicle extends Vehicle{

    public SportVehicle() {
        super(new SpecialDrive());
    }
}
