package com.designpatterns.observerPattern.observable;

import com.designpatterns.observerPattern.observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void addStockCount(int newStockCount);

    public int getStockCount();


}
