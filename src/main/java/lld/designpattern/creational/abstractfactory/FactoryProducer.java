package main.java.lld.designpattern.creational.abstractfactory;

// Factory of factory
public class FactoryProducer {
  public CarFactory getCarFactoryInstance(String value) {
    if (value.equals("Economic")) {
      return new EconomicCarFactory();
    } else if (value.equals("Luxury") || value.equals("Premium")) {
      return new LuxuryCarFactory();
    }
    return null;
  }

}
