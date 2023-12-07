package com.designpatterns.observerPattern.observer;

import com.designpatterns.observerPattern.observable.StockObservable;

public class MobileNotification  implements  NotificationAlertObserver{
    String phoneNo;
    StockObservable observable;

    public MobileNotification(String phoneNo, StockObservable observable){
        this.phoneNo=phoneNo;
        this.observable=observable;
    }

    @Override
    public void update() {
        sendPhoneMessage(phoneNo,"");
    }

    public void sendPhoneMessage(String phone,String msg){
        System.out.println("Message sent to" + phone);
    }
}
