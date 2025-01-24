package main.java.lld.designpattern.abstractfactorypattern;

public class Main {
  public static void main(String[] args) {
    FactoryProducer factoryProducer = new FactoryProducer();
    CarFactory luxuryFactory = factoryProducer.getCarFactoryInstance("Luxury");
    Car luxuryCar = luxuryFactory.getCarInstance(50000000);
    System.out.println(luxuryCar.getTopSpeed());
  }
}
