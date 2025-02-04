package main.java.lld.designpattern.behavioral.command;

public class Main {
  public static void main(String[] args) {
    AirConditioner airConditioner = new AirConditioner();
    MyRemote remote = new MyRemote();
    remote.setCommand(new TurnOnAcCommand(airConditioner));
    remote.pressButton();

    remote.undo(1);
  }
}
