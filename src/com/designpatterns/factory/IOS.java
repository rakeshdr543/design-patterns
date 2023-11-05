package com.designpatterns.factory;

public class IOS implements  OS{
    @Override
    public void spec() {
        System.out.println("IOS closed OS");
    }
}
