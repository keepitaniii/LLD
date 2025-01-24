package main.java.lld.designpattern.strategypattern;

import main.java.lld.designpattern.strategypattern.strategy.DriveStrategy;
import main.java.lld.designpattern.strategypattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
  public OffRoadVehicle() {
    super(new SportsDriveStrategy() );
  }
}
