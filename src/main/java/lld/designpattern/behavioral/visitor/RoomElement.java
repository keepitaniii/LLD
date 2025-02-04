package main.java.lld.designpattern.behavioral.visitor;

public interface RoomElement {
  public void accept(RoomVisitor visitor);
}
