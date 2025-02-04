package main.java.lld.designpattern.behavioral.observer;

import main.java.lld.designpattern.behavioral.observer.observable.IphoneObservableImpl;
import main.java.lld.designpattern.behavioral.observer.observable.StocksObservable;
import main.java.lld.designpattern.behavioral.observer.observer.EmailAlertObserverImpl;
import main.java.lld.designpattern.behavioral.observer.observer.MobileAlertObserverImpl;
import main.java.lld.designpattern.behavioral.observer.observer.NotificationAlertObserver;

public class Store {

  public static void main(String[] args) {
    StocksObservable iphoneStockObservable = new IphoneObservableImpl();

    NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneStockObservable);
    NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz2@gmail.com", iphoneStockObservable);
    NotificationAlertObserver observer3 = new MobileAlertObserverImpl("987654321", iphoneStockObservable);

    iphoneStockObservable.add(observer1);
    iphoneStockObservable.add(observer2);
    iphoneStockObservable.add(observer3);

    iphoneStockObservable.setStockCount(10);
  }
}
