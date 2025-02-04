package main.java.lld.designpattern.behavioral.mediator;

public interface AuctionMediator {
  public void addBidder(Colleague bidder);

  public void placeBid(Colleague bidder, int amount);
}
