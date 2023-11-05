package com.designpatterns.builder;

public class Phone {
    private String os;
    private int battery;
    private int memory;
    private int ram;
    private String color;

    private String variant;


    public Phone(String os, int battery, int memory, int ram, String color, String variant) {
        this.os = os;
        this.battery = battery;
        this.memory = memory;
        this.ram = ram;
        this.color = color;
        this.variant = variant;
    }

}
