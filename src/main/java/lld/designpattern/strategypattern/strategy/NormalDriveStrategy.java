package main.java.lld.designpattern.strategypattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {
  @Override
  public void drive() {
    System.out.println("Normal drive");
  }
}
