package main.java.lld.designpattern.command;

public class TurnOnAcCommand implements Command {
  AirConditioner ac;

  TurnOnAcCommand(AirConditioner ac) {
    this.ac = ac;
  }

  @Override
  public void execute() {
    ac.turnOnAc();
  }

  @Override
  public void undo() {
    ac.turnOffAc();
  }
}
