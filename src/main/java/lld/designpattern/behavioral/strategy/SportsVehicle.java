package main.java.lld.designpattern.behavioral.strategy;

import main.java.lld.designpattern.behavioral.strategy.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
  public SportsVehicle() {
    super(new SportsDriveStrategy());
  }
}
