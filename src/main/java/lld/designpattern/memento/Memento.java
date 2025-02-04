package main.java.lld.designpattern.memento;

public class Memento {
  // Contains property to be saved(keep history of).
  private int height;
  private int width;

  Memento(int height, int width) {
    this.height = height;
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }
}
