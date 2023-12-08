package com.designpatterns.decorator;

public class Mushroom extends Toppings{

    public BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    @Override
    public int getCost() {
        return this.basePizza.getCost()+60;
    }
}
