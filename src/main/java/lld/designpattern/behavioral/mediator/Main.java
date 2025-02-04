package main.java.lld.designpattern.behavioral.mediator;

public class Main {
  public static void main(String[] args) {
    AuctionMediator auctionMediator = new Auction();
    Colleague bidder1 = new Bidder("A", auctionMediator);
    Colleague bidder2 = new Bidder("B", auctionMediator);

    auctionMediator.addBidder(bidder1);
    auctionMediator.addBidder(bidder2);

    bidder1.placeBid(10);
    bidder2.placeBid(20);
    bidder1.placeBid(50);
  }
}
