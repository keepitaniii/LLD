package main.java.lld.designpattern.observerpattern.observer;

import main.java.lld.designpattern.observerpattern.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
  String emailId;
  StocksObservable observable;

  public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
    this.emailId = emailId;
    this.observable = observable;
  }

  @Override
  public void update() {
    sendMail(emailId, "Product is in stock, hurry up!");
  }

  private void sendMail(String emailId, String message) {
    System.out.println("Email sent to " + emailId + " with " + message);
  }
}
