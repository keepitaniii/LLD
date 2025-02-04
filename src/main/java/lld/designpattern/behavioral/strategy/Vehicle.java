package main.java.lld.designpattern.behavioral.strategy;

import main.java.lld.designpattern.behavioral.strategy.strategy.DriveStrategy;

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
