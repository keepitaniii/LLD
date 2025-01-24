package main.java.lld.designpattern.decoratorpattern;

public class PizzaOrder {
  public static void main(String[] args) {
    BasePizza pizza = new Mushroom(new ExtraCheese(new VeggieDelight()));
    System.out.println(pizza.cost());
  }
}
