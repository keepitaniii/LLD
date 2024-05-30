package main.java.lld.parkinglot;

import main.java.lld.parkinglot.constants.PaymentType;

import java.time.Instant;
import java.util.Date;

public class Exit extends ParkingGate {
  public ParkingTicket payParkingFee(ParkingTicket parkingTicket, PaymentType paymentType, double parkingRatePerHour) {
    parkingTicket.updateExitTime(Date.from(Instant.now()));
    parkingTicket.updateParkingCost(parkingRatePerHour);
    parkingAttendant.processPayment(parkingTicket, paymentType);
    return parkingTicket;
  }
}
