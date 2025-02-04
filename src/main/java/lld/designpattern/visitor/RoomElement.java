package main.java.lld.designpattern.visitor;

public interface RoomElement {
  public void accept(RoomVisitor visitor);
}
