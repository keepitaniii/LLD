package main.java.lld.parkinglot;

public class ParkingGate {
  String gateId;
  ParkingAttendant parkingAttendant;

  public String getGateId() {
    return gateId;
  }

  public void setGateId(String gateId) {
    this.gateId = gateId;
  }

  public ParkingAttendant getParkingAttendant() {
    return parkingAttendant;
  }

  public void setParkingAttendant(ParkingAttendant parkingAttendant) {
    this.parkingAttendant = parkingAttendant;
  }
}
