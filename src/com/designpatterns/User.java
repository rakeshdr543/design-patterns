package com.designpatterns;

import java.util.Arrays;

public class User {
    public String name;

    public User(String name){
        this.name=name;
    }

    public void printName(){
        System.out.println(name);
    }
}
