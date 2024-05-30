package main.java.lld.parkinglot;

public class Admin extends Account {
  public boolean addParkingFloor(ParkingLot parkingLot, ParkingFloor parkingFloor) {
    parkingLot.parkingFloors.add(parkingFloor);
    return true;
  }

  public boolean addParkingSpace(ParkingFloor parkingFloor, ParkingSpace parkingSpace) {
    parkingFloor.parkingSpaces.add(parkingSpace);
    return true;
  }

  public boolean addDisplayBoard(ParkingFloor parkingFloor, DisplayBoard displayBoard) {
    parkingFloor.displayBoard = displayBoard;
    return true;
  }
}
