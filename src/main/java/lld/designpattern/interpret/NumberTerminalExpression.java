package main.java.lld.designpattern.interpret;

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
