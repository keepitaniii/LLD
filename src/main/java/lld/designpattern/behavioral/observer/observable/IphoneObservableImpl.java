package main.java.lld.designpattern.behavioral.observer.observable;

import main.java.lld.designpattern.behavioral.observer.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {
  public List<NotificationAlertObserver> observers = new ArrayList<>();
  public int stockCount = 0;

  @Override
  public void add(NotificationAlertObserver observer) {
    observers.add(observer);
  }

  @Override
  public void remove(NotificationAlertObserver observer) {
    observers.remove(observer);
  }

  @Override
  public void notifySubscribers() {
    for (NotificationAlertObserver observer : observers) {
      observer.update();
    }
  }

  @Override
  public void setStockCount(int newStocks) {
    if (stockCount == 0) {
      notifySubscribers();
    }
    stockCount+=newStocks;
  }

  @Override
  public int getStockCount() {
    return stockCount;
  }
}
