package main.java.lld.designpattern.facade;

public class OrderClient {

  public static void main(String[] args) {
    OrderFacade orderFacade = new OrderFacade();
    orderFacade.createOrder();
  }
}
