package com.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private String name;
    List<Component> components=new ArrayList<>();

    public Composite(String name) {
        super();
        this.name = name;
    }

    public void addComponents(Component comp){
        components.add(comp);
    }

    @Override
    public void showPrice() {
        System.out.println(this.name);

        for(Component c: components){
            c.showPrice();
        }
        System.out.println();

    }
}
