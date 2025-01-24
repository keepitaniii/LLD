package main.java.lld.designpattern.observerpattern;

import main.java.lld.designpattern.observerpattern.observable.IphoneObservableImpl;
import main.java.lld.designpattern.observerpattern.observable.StocksObservable;
import main.java.lld.designpattern.observerpattern.observer.EmailAlertObserverImpl;
import main.java.lld.designpattern.observerpattern.observer.MobileAlertObserverImpl;
import main.java.lld.designpattern.observerpattern.observer.NotificationAlertObserver;

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
