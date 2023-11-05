package com.designpatterns.builder;

public class PhoneBuilder {
    private String os;
    private int battery;
    private int memory;
    private int ram;
    private String color;

    private String variant;

    private Phone phone;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return  this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setMemory(int memory) {
        this.memory = memory;
        return this;
    }

    public PhoneBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public PhoneBuilder setVariant(String variant){
        this.variant=variant;
        return this;
    }

    public Phone buildPhone(){
        return new Phone(this.os,this.battery,this.memory,this.ram,this.color,this.variant);
    }
}
