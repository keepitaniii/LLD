package main.java.lld.designpattern.structural.decorator;

public class PizzaOrder {
  public static void main(String[] args) {
    BasePizza pizza = new Mushroom(new ExtraCheese(new VeggieDelight()));
    System.out.println(pizza.cost());
  }
}
