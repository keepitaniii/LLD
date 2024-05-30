package main.java.lld.parkinglot;

import java.util.List;

public class ParkingFloor {
  private int floorNumber;
  List<ParkingSpace> parkingSpaces;
  DisplayBoard displayBoard = new DisplayBoard();

  public ParkingFloor(int floorNumber, List<ParkingSpace> parkingSpaces) {
    this.floorNumber = floorNumber;
    this.parkingSpaces = parkingSpaces;
    parkingSpaces.forEach(parkingSpace -> displayBoard.updateDisplayBoard(parkingSpace.parkingSpaceType, 1));
  }
}
