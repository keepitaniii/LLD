package main.java.lld.designpattern.behavioral.interpreter;

public class MultiplyNonTerminalExpression implements AbstractExpression {
  AbstractExpression leftExpression;
  AbstractExpression rightExpression;

  MultiplyNonTerminalExpression(AbstractExpression left, AbstractExpression right) {
    this.leftExpression = left;
    this.rightExpression = right;
  }

  @Override
  public int interpret(Context context) {
    return leftExpression.interpret(context) * rightExpression.interpret(context);
  }
}
