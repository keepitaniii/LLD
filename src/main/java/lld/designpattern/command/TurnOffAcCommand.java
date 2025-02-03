package main.java.lld.designpattern.command;

public class TurnOffAcCommand implements Command {
  AirConditioner ac;

  TurnOffAcCommand(AirConditioner ac) {
    this.ac = ac;
  }

  @Override
  public void execute() {
    ac.turnOffAc();
  }

  @Override
  public void undo() {
    ac.turnOnAc();
  }
}
