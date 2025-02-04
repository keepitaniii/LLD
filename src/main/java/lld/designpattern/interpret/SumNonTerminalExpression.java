package main.java.lld.designpattern.interpret;

public class SumNonTerminalExpression implements AbstractExpression {
  AbstractExpression leftExpression;
  AbstractExpression rightExpression;

  SumNonTerminalExpression(AbstractExpression left, AbstractExpression right) {
    this.leftExpression = left;
    this.rightExpression = right;
  }

  @Override
  public int interpret(Context context) {
    return leftExpression.interpret(context) + rightExpression.interpret(context);
  }
}
