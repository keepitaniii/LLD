package main.java.lld.designpattern.bridgepattern;

public class Main {
  public static void main(String[] args) {
    Fish fish = new Fish(new WaterBreathe());
    fish.breatheProcess();
  }
}
