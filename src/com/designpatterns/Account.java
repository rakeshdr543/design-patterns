package com.designpatterns;

public class Account {

    private Float balance= (float) 0;

    public void withdraw(Float amount){
        if(amount<this.balance){
            this.balance-=amount;
        }
    }

    public void deposit(Float amount){
        this.balance+=amount;
    }

    public Float getBalance(){
        return this.balance;
    }
}
