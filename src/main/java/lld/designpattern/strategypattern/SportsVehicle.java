package main.java.lld.designpattern.strategypattern;

import main.java.lld.designpattern.strategypattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
  public SportsVehicle() {
    super(new SportsDriveStrategy());
  }
}
