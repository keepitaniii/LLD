package main.java.lld.designpattern.observerpattern.observable;

import main.java.lld.designpattern.observerpattern.observer.NotificationAlertObserver;

public interface StocksObservable {
  public void add(NotificationAlertObserver observer);

  public void remove(NotificationAlertObserver observer);

  public void notifySubscribers();

  public void setStockCount(int newStocks);

  public int getStockCount();
}
