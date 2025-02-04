package main.java.lld.designpattern.behavioral.visitor;

public class DoubleRoom implements RoomElement {
  int price;

  @Override
  public void accept(RoomVisitor visitor) {
    visitor.visit(this);
  }

  public int getPrice() {
    return price;
  }
}
