package main.java.lld.designpattern.behavioral.strategy;

import main.java.lld.designpattern.behavioral.strategy.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
  public OffRoadVehicle() {
    super(new SportsDriveStrategy() );
  }
}
