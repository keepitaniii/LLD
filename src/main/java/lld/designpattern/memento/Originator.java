package main.java.lld.designpattern.memento;

public class Originator {
  private int height;
  private int width;

  Originator(int height, int width) {
    this.height = height;
    this.width = width;
  }

  public Memento createMemento() {
    return new Memento(height, width);
  }

  public void restoreMemento(Memento mementoToBeRestored) {
    this.height = mementoToBeRestored.getHeight();
    this.width = mementoToBeRestored.getWidth();
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }
}
