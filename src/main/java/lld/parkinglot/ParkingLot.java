package main.java.lld.parkinglot;

import main.java.lld.parkinglot.constants.ParkingSpaceType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
  List<ParkingFloor> parkingFloors = new ArrayList<>();
  Map<String, ParkingTicket> activeTickets = new HashMap<>();
  Map<String, Entrance> entrances = new HashMap<>();
  Map<String, Exit> exits = new HashMap<>();

  private Address address;
  private String parkingLotName;

  public boolean isParkingSpaceAvailableForVehicle(Vehicle vehicle) {
    return getParkingSpaceAvailableForVehicle(vehicle) != null;
  }

  public ParkingSpace getParkingSpaceAvailableForVehicle(Vehicle vehicle) {
    ParkingSpace emptyParkingSpace = null;
    for (ParkingFloor parkingFloor : parkingFloors) {
      for (ParkingSpace parkingSpace : parkingFloor.parkingSpaces) {
        ParkingSpaceType parkingSpaceType = null;
        switch (vehicle.getVehicleType()) {
          case TWO_WHEELER -> parkingSpaceType = ParkingSpaceType.BIKE;
          case FOUR_WHEELER -> parkingSpaceType = ParkingSpaceType.CAR;
          case HEAVY_LOAD -> parkingSpaceType = ParkingSpaceType.TRUCK;
        }
        if (parkingSpace.parkingSpaceType == parkingSpaceType && parkingSpace.isAvailable) {
          emptyParkingSpace = parkingSpace;
          return emptyParkingSpace;
        }
      }
    }
    return emptyParkingSpace;
  }

  public boolean updateParkingAttendant(ParkingAttendant parkingAttendant, String gateId) {
    for (Map.Entry<String, Entrance> entrance : entrances.entrySet()) {
      if (entrance.getKey().equals(gateId)) {
        entrance.getValue().setParkingAttendant(parkingAttendant);
        return true;
      }
    }
    // Check gate Id with exits.
    for (Map.Entry<String, Exit> exit : exits.entrySet()) {
      if (exit.getKey().equals(gateId)) {
        exit.getValue().setParkingAttendant(parkingAttendant);
        return true;
      }
    }
    return false;
  }

  public void parkVehicle(Vehicle vehicle, Entrance entrance) {
    ParkingSpace emptyParkingSpace = getParkingSpaceAvailableForVehicle(vehicle);
    if (emptyParkingSpace == null) {
      System.out.println("Parking full");
      return;
    }

    ParkingTicket parkingTicket = entrance.getParkingTicket(vehicle);
    activeTickets.put(parkingTicket.getTicketId(), parkingTicket);
    System.out.println(parkingTicket);

    emptyParkingSpace.isAvailable = false;

  }
}
