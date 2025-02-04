package main.java.lld.designpattern.behavioral.strategy;

import main.java.lld.designpattern.behavioral.strategy.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
  public PassengerVehicle() {
    super(new NormalDriveStrategy());
  }
}
