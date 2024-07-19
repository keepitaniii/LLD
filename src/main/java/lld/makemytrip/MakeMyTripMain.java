package main.java.lld.makemytrip;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class MakeMyTripMain {
}

class System {
  private List<Flight> flights;
  private static System system = null;

  private System(){}

  public static System getInstance() {
    if (system == null) {
      system = new System();
    }
    return system;
  }

  public List<Flight> fetchFlights(String src, String dest, Date date) {
    List<Flight> filteredFlights = new ArrayList<Flight>();
    for (Flight flight : flights) {
      if (flight.date == date && flight.src.equals(src) && flight.dest.equals(dest)) {
        filteredFlights.add(flight);
      }
    }
    return filteredFlights;
  }

  public boolean fixSeat(Aircraft aircraft, Seat seat) {
    aircraft.fixSeat(seat, seat.getCustomer());
    return true;
  }

  public boolean addFlight(Flight flight) {
    flights.add(flight);
    return true;
  }

  public boolean cancelFlight(Flight flight) {
    Map<String, Seat> seats = flight.getAircraft().getSeats();
    return true;
  }
}

class Flight {
  public Date date;
  public String src;
  public String dest;
  public Aircraft aircraft;
  public Time startTime;
  public Time endTime;

  public Aircraft getAircraft() {
    return aircraft;
  }

  public boolean cancelForCustomer(Customer customer) {
    Map<String, Seat> seats = aircraft.getSeats();
    for (Seat seat : seats.values()) {
      if (seat.getCustomer() == customer) {
        seat.setCustomer(null);
      }
    }
    return true;
  }
}

class Aircraft {
  Map<String, Seat> seats;

  public Map<String, Seat> getSeats() {
    return seats;
  }

  public boolean fixSeat(Seat seat, Customer customer) {
    if (seat.getCustomer() == null) return false;
    seat.setCustomer(customer);
    return true;
  }

  public boolean addSeat(List<Seat> seats) {
    seats.forEach(seat -> this.seats.put(seat.getId(), seat));
    return true;
  }
}

enum SeatType {
  ECONOMY,
  BUSINESS
}

class Seat {
  private String id;
  private SeatType seatType;
  private Customer customer;
  private int price;

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public String getId() {
    return id;
  }
}

class User {
  String id;
  String name;
  String email;
  System system;
}

class Customer extends User {
  public boolean fixSeat(Flight flight, Seat seat) {
    return flight.getAircraft().fixSeat(seat, this);
  }

  public boolean cancelBooking(Flight flight) {
    flight.cancelForCustomer(this);
    return true;
  }
}

class Admin extends User {

}