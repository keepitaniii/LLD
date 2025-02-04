package main.java.lld.designpattern.mediator;

public interface AuctionMediator {
  public void addBidder(Colleague bidder);

  public void placeBid(Colleague bidder, int amount);
}
