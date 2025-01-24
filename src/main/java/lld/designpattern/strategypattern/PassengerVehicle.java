package main.java.lld.designpattern.strategypattern;

import main.java.lld.designpattern.strategypattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
  public PassengerVehicle() {
    super(new NormalDriveStrategy());
  }
}
