package main.java.lld.designpattern.behavioral.strategy.strategy;

public class NormalDriveStrategy implements DriveStrategy {
  @Override
  public void drive() {
    System.out.println("Normal drive");
  }
}
