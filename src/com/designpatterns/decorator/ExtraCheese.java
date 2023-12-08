package com.designpatterns.decorator;

public class ExtraCheese extends Toppings{

    public BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    @Override
    public int getCost() {
        return this.basePizza.getCost()+20;
    }
}
