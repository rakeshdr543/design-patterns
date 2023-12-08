package com.designpatterns.strategy;

public class Vehicle {

    Drive driveStrategy;
    public Vehicle(Drive driveStrategy){
        this.driveStrategy=driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
