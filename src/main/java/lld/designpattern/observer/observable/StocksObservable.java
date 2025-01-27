package main.java.lld.designpattern.observer.observable;

import main.java.lld.designpattern.observer.observer.NotificationAlertObserver;

public interface StocksObservable {
  public void add(NotificationAlertObserver observer);

  public void remove(NotificationAlertObserver observer);

  public void notifySubscribers();

  public void setStockCount(int newStocks);

  public int getStockCount();
}
