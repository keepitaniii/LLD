package main.java.lld.designpattern.visitor;

public class RoomPricingVisitor implements RoomVisitor {
  @Override
  public void visit(SingleRoom singleRoom) {
    singleRoom.price = 1000;
    System.out.println("Price for Single room - " + singleRoom.price);
  }

  @Override
  public void visit(DoubleRoom doubleRoom) {
    doubleRoom.price = 1000;
    System.out.println("Price for Double room - " + doubleRoom.price);
  }

  @Override
  public void visit(DeluxeRoom deluxeRoom) {
    deluxeRoom.price = 1000;
    System.out.println("Price for Deluxe room - " + deluxeRoom.price);
  }
}
