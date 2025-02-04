package main.java.lld.designpattern.mediator;

public class Bidder implements Colleague {
  private String name;
  AuctionMediator auctionMediator;

  Bidder(String name, AuctionMediator auctionMediator) {
    this.name = name;
    this.auctionMediator = auctionMediator;
  }

  @Override
  public void placeBid(int amount) {
    auctionMediator.placeBid(this, amount);
  }

  @Override
  public void receiveBidNotification(Colleague bidder, int amount) {
    System.out.println(amount + " bid placed by " + bidder.getName());
  }

  @Override
  public String getName() {
    return name;
  }
}
