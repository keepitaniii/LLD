package main.java.lld.designpattern.behavioral.mediator;

public interface Colleague {
  public void placeBid(int amount);

  public void receiveBidNotification(Colleague bidder, int amount);

  public String getName();
}
