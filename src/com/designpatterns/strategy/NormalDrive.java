package com.designpatterns.strategy;

public class NormalDrive implements Drive{
    @Override
    public void drive() {
        System.out.println("Normal drive capability");
    }
}
