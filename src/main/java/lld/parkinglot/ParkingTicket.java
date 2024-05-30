package main.java.lld.parkinglot;

import main.java.lld.parkinglot.constants.ParkingSpaceType;
import main.java.lld.parkinglot.constants.ParkingTicketStatus;

import java.time.Instant;
import java.util.Date;

public class ParkingTicket {
  private String ticketId;
  private int floorNo;
  private int spaceId;
  Date entryTime;
  Date exitTime;
  double parkingCost;
  ParkingSpaceType parkingSpaceType;
  private Vehicle vehicle;
  ParkingTicketStatus parkingTicketStatus;

  public ParkingTicket() {
  }

  public ParkingTicket(Vehicle vehicle) {
    this.entryTime = Date.from(Instant.now());
    switch (vehicle.getVehicleType()) {
      case TWO_WHEELER -> parkingSpaceType = ParkingSpaceType.BIKE;
      case FOUR_WHEELER -> parkingSpaceType = ParkingSpaceType.CAR;
      case HEAVY_LOAD -> parkingSpaceType = ParkingSpaceType.TRUCK;
    }
    parkingTicketStatus = ParkingTicketStatus.ACTIVE;
    this.vehicle = vehicle;
  }

  public void updateParkingCost(double parkingRatePerHour) {
    int parkingHours = exitTime.getHours() - entryTime.getHours();
    this.parkingCost = (parkingHours <=0 ? 1 : parkingHours)*parkingRatePerHour;
  }

  public void updateExitTime(Date exitTime) {
    this.exitTime = exitTime;
  }

  public String getTicketId() {
    return ticketId;
  }

  public void setTicketId(String ticketId) {
    this.ticketId = ticketId;
  }

  public int getFloorNo() {
    return floorNo;
  }

  public void setFloorNo(int floorNo) {
    this.floorNo = floorNo;
  }

  public int getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(int spaceId) {
    this.spaceId = spaceId;
  }
}
