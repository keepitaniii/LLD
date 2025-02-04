package main.java.lld.designpattern.behavioral.interpreter;

public class Client {
  public static void main(String[] args) {
    // Initialize context;;
    Context context = new Context();
    context.put("a", 10);
    context.put("b", 20);

    NumberTerminalExpression a = new NumberTerminalExpression("a");
    NumberTerminalExpression b = new NumberTerminalExpression("b");

    // a*b.
    AbstractExpression expression1 = new MultiplyNonTerminalExpression(a, b);
    System.out.println(expression1.interpret(context));

    // a+b.
    AbstractExpression expression2 = new SumNonTerminalExpression(a, b);
    System.out.println(expression2.interpret(context));
  }
}
