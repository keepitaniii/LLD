package main.java.lld.parkinglot;

import main.java.lld.parkinglot.constants.ParkingSpaceType;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class DisplayBoard {
  private final static Logger logger = Logger.getLogger(DisplayBoard.class.getSimpleName());
  Map<ParkingSpaceType, Integer> freeSpotsAvailableMap = new HashMap<>();

  public void updateDisplayBoard(ParkingSpaceType parkingSpaceType, int spaces) {
    freeSpotsAvailableMap.put(parkingSpaceType, freeSpotsAvailableMap.getOrDefault(parkingSpaceType, 0) + spaces);
  }

  public void showAvailableSpaces() {
    logger.info("Available Parking Spaces");
    for (Map.Entry<ParkingSpaceType, Integer> freeSpots: freeSpotsAvailableMap.entrySet()) {
      logger.info(freeSpots.getKey() + " : " + freeSpots.getValue());
    }
  }
}
