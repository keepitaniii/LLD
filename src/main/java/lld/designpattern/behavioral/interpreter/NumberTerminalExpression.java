package main.java.lld.designpattern.behavioral.interpreter;

public class NumberTerminalExpression implements AbstractExpression {
  String variable;

  NumberTerminalExpression(String variable) {
    this.variable = variable;
  }

  @Override
  public int interpret(Context context) {
    return context.get(variable);
  }
}
