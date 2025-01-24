package main.java.lld.designpattern.strategypattern;

import main.java.lld.designpattern.strategypattern.strategy.DriveStrategy;

public class Vehicle {
  DriveStrategy driveStrategy;

  // Constructor injection.
  public Vehicle(DriveStrategy driveStrategy) {
    this.driveStrategy = driveStrategy;
  }

  public void drive() {
    driveStrategy.drive();
  }
}
