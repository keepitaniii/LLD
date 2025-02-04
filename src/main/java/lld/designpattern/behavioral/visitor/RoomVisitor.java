package main.java.lld.designpattern.behavioral.visitor;

public interface RoomVisitor {
  public void visit(SingleRoom singleRoom);
  public void visit(DoubleRoom doubleRoom);
  public void visit(DeluxeRoom deluxeRoom);
}
