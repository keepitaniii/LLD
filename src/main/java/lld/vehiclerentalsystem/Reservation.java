package main.java.lld.vehiclerentalsystem;

import main.java.lld.bookmyshow.Address;
import main.java.lld.vehiclerentalsystem.product.Vehicle;

import java.util.Date;

public class Reservation {
  int reservationId;
  User user;
  Vehicle vehicle;
  Date bookingDate;
  Date from;
  Date till;
  ReservationStatus status;
  ReservationType reservationType;
  Address dropLocation;
  Address pickUpLocation;
}
