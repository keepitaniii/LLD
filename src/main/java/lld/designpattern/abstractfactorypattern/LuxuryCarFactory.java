package main.java.lld.designpattern.abstractfactorypattern;

public class LuxuryCarFactory implements CarFactory {
  @Override
  public Car getCarInstance(int price) {
    if (price >= 10000000 && price <= 30000000) {
      return new LuxuryCar1();
    } else if (price > 30000000) {
      return new LuxuryCar2();
    }
    return null;
  }
}
