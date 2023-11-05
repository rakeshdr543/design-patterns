package com.designpatterns.factory;

public class OSFactory {

    public OS getInstance(String type){
        if(type.equalsIgnoreCase("android")){
            return new Android();
        } else if (type.equalsIgnoreCase("ios")) {
            return new IOS();
        }else{
            return new Windows();
        }

    }
}
