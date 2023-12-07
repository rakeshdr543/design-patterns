package com.designpatterns.observerPattern.observer;

import com.designpatterns.observerPattern.observable.StockObservable;

public class EmailNotification implements  NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    public EmailNotification(String emailId, StockObservable observable){
        this.emailId=emailId;
        this.observable=observable;
    }

    @Override
    public void update() {
        sendEmail(emailId,"");
    }

    public void sendEmail(String email,String msg){
        System.out.println("Mail sent to" + email);
    }
}
