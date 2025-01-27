package main.java.lld.designpattern.creational.factory;

public class ShapeFactory {

  Shape getShape(String shape) {
    switch (shape) {
      case "CIRCLE":
        return new Circle();
      case "SQUARE":
        return new Square();
      case "TRIANGLE":
        return new Triangle();
      default:
        return null;
    }
  }
}
