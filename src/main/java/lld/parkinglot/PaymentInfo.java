package main.java.lld.parkinglot;

import main.java.lld.parkinglot.constants.PaymentStatus;

import java.util.Date;

public class PaymentInfo {
  private double amount;
  private Date paymentDate;
  private String transactionId;
  private ParkingTicket parkingTicket;
  private PaymentStatus paymentStatus;

  public PaymentInfo(Date paymentDate, ParkingTicket parkingTicket) {
    this.paymentDate = paymentDate;
    this.parkingTicket = parkingTicket;
    this.transactionId = parkingTicket.getTicketId() + "_" + paymentDate;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public Date getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(Date paymentDate) {
    this.paymentDate = paymentDate;
  }

  public ParkingTicket getParkingTicket() {
    return parkingTicket;
  }

  public void setParkingTicket(ParkingTicket parkingTicket) {
    this.parkingTicket = parkingTicket;
  }

  public PaymentStatus getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(PaymentStatus paymentStatus) {
    this.paymentStatus = paymentStatus;
  }
}
