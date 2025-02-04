package main.java.lld.designpattern.behavioral.command;

import java.util.Stack;

// Currently, remote has only one button.
public class MyRemote {
  Command command;
  Stack<Command> commandHistory = new Stack<>();

  public void setCommand(Command command) {
    this.command = command;
  }

  public void pressButton() {
    command.execute();
    commandHistory.add(command);
  }

  public void undo(int times) {
    while(!commandHistory.empty() && times > 0) {
      Command lastCommand = commandHistory.pop();
      lastCommand.undo();
    }
  }

}
