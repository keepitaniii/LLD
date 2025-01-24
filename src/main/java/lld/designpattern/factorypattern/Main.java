package main.java.lld.designpattern.factorypattern;

public class Main {
  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();
    Shape circle = shapeFactory.getShape("CIRCLE");
    circle.computeArea();
  }
}
