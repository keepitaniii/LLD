package main.java.lld.designpattern.structural.decorator;

public class Mushroom extends ToppingDecorator {

  BasePizza basePizza;

  public Mushroom(BasePizza basePizza) {
    this.basePizza = basePizza;
  }

  @Override
  public int cost() {
    return this.basePizza.cost() + 40;
  }
}
