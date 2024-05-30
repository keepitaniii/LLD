package main.java.lld.parkinglot;

import main.java.lld.parkinglot.constants.PaymentType;

import java.time.Instant;
import java.util.Date;


public class ParkingAttendant extends Account {

  public boolean processVehicleEntry(Vehicle vehicle) {
    return true;
  }

  public PaymentInfo processPayment(ParkingTicket parkingTicket, PaymentType paymentType) {
    PaymentInfo paymentInfo = new PaymentInfo(Date.from(Instant.now()), parkingTicket);
    return paymentInfo;
  }
}
