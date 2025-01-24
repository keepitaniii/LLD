package main.java.lld.designpattern.strategypattern.strategy;

public class SportsDriveStrategy implements DriveStrategy {
  @Override
  public void drive() {
    System.out.println("Sports drive");
  }
}
