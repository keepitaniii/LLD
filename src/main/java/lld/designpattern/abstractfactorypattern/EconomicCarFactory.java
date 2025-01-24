package main.java.lld.designpattern.abstractfactorypattern;

public class EconomicCarFactory implements CarFactory {
  @Override
  public Car getCarInstance(int price) {
    if (price >= 300000 && price <= 500000) {
      return new EconomicCar1();
    } else if (price <= 1000000) {
      return new EconomicCar2();
    }
    return null;
  }
}
