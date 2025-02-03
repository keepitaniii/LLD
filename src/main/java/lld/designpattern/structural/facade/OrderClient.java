package main.java.lld.designpattern.structural.facade;

public class OrderClient {

  public static void main(String[] args) {
    OrderFacade orderFacade = new OrderFacade();
    orderFacade.createOrder();
  }
}
