package com.designpatterns.composite;

public class LeafComponent implements Component{
    private int price;
    private String name;

    public LeafComponent(int price, String name) {
        this.price = price;
        this.name = name;
    }


    @Override
    public void showPrice() {
    System.out.println(name+": "+price);
    }
}
