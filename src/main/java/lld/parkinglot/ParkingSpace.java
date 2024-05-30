package main.java.lld.parkinglot;

import main.java.lld.parkinglot.constants.ParkingSpaceType;

public class ParkingSpace {
  private int spaceId;
  ParkingSpaceType parkingSpaceType;
  double parkingCostPerHour;
  boolean isAvailable;

  public ParkingSpace(int spaceId, ParkingSpaceType parkingSpaceType,
                      double parkingCostPerHour, boolean isAvailable) {
    this.spaceId = spaceId;
    this.parkingSpaceType = parkingSpaceType;
    this.parkingCostPerHour = parkingCostPerHour;
    this.isAvailable = isAvailable;
  }
}
