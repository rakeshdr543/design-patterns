package com.designpatterns.strategy;

public class PassengerCar  extends Vehicle{



    public PassengerCar() {
        super(new NormalDrive());
    }
}


