package main.java.lld.designpattern.observer.observer;

import main.java.lld.designpattern.observer.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
  String phoneNumber;
  StocksObservable observable;

  public MobileAlertObserverImpl(String phoneNumber, StocksObservable observable) {
    this.observable = observable;
    this.phoneNumber = phoneNumber;
  }

  @Override
  public void update() {
      sendMessageOnMobile(phoneNumber, "Product is in stock, hurry up!");
  }

  private void sendMessageOnMobile(String phoneNumber, String message) {
    System.out.println("Message: " + message + " sent to: " + phoneNumber);
  }
}
