package main.java.lld.parkinglot;

public class Entrance extends ParkingGate{
  public ParkingTicket getParkingTicket(Vehicle vehicle) {
    return new ParkingTicket(vehicle);
  }
}
