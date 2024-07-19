package main.java.lld.bookmyshow;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Movie {
  int id;
  String name;
  int duration;
  String language;
  Genre genre;
  Date releasedDate;
  Map<String, List<Show>> cityShows;
}
