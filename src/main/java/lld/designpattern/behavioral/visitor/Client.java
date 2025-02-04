package main.java.lld.designpattern.behavioral.visitor;

public class Client {

  public static void main(String[] args) {
    RoomElement singleRoom = new SingleRoom();
    RoomElement doubleRoom = new DoubleRoom();
    RoomElement deluxeRoom = new DeluxeRoom();
    RoomPricingVisitor pricingVisitor = new RoomPricingVisitor();

    // Perform price operations.
    singleRoom.accept(pricingVisitor);
    System.out.println(((SingleRoom) singleRoom).getPrice());
  }
}
