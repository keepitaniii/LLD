package main.java.lld.designpattern.behavioral.strategy.strategy;

public class SportsDriveStrategy implements DriveStrategy {
  @Override
  public void drive() {
    System.out.println("Sports drive");
  }
}
