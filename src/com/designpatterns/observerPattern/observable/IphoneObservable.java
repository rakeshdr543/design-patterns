package com.designpatterns.observerPattern.observable;

import com.designpatterns.observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements  StockObservable{

    public List<NotificationAlertObserver> observerList= new ArrayList<>();
public int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer:observerList){
            observer.update();
        }
    }

    @Override
    public void addStockCount(int newStockCount) {
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount+= newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
