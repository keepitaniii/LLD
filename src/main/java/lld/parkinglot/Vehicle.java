package main.java.lld.parkinglot;

import main.java.lld.parkinglot.constants.VehicleType;

public class Vehicle {
  private VehicleType vehicleType;
  private String licenseNumber;
  private int numberOfPassengers;
  ParkingTicket parkingTicket;
  PaymentInfo paymentInfo;

  public Vehicle(VehicleType vehicleType, String licenseNumber, int numberOfPassengers) {
    this.vehicleType = vehicleType;
    this.licenseNumber = licenseNumber;
    this.numberOfPassengers = numberOfPassengers;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }
}
