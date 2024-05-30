package main.java.lld.parkinglot;

import main.java.lld.parkinglot.constants.ParkingSpaceType;
import main.java.lld.parkinglot.constants.VehicleType;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    ParkingLot parkingLot = new ParkingLot();
    Admin admin = new Admin();

    // Parking Spaces.
    ParkingSpace parkingSpace1 = new ParkingSpace(1, ParkingSpaceType.BIKE, 0.5, false);
    ParkingSpace parkingSpace2 = new ParkingSpace(2, ParkingSpaceType.CAR, 1.0, true);
    ParkingSpace parkingSpace3 = new ParkingSpace(3, ParkingSpaceType.TRUCK, 2.0, true);

    ParkingFloor parkingFloor = new ParkingFloor(1,
      Arrays.asList(parkingSpace1, parkingSpace2, parkingSpace3));

    admin.addParkingFloor(parkingLot, parkingFloor);
//    admin.addParkingSpace(parkingFloor, parkingSpace1);

    Vehicle bike = new Vehicle(VehicleType.TWO_WHEELER, "sgbkjb", 1);
    System.out.println(parkingLot.isParkingSpaceAvailableForVehicle(bike));

    parkingLot.parkVehicle(bike, new Entrance());

  }
}
