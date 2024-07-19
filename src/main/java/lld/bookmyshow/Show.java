package main.java.lld.bookmyshow;

import java.util.Date;
import java.util.List;

public class Show {
  int id;
  String movie;
  Date startTime;
  Date endTime;
  CinemaHall cinemaHallPlayedAt;
  List<Seat> seats;
}
