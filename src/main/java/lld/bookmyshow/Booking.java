package main.java.lld.bookmyshow;

import java.util.Date;
import java.util.List;

public class Booking {
  String id;
  Date bookingDate;
  Member member;
  Show show;
  Audi audi;
  BookingStatus status;
  double amount;
  List<Seat> seats;
  Payment payment;

  public boolean makePayment(Payment payment) {
    return true;
  }
}
