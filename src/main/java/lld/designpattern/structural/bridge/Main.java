package main.java.lld.designpattern.structural.bridge;

public class Main {
  public static void main(String[] args) {
    Fish fish = new Fish(new WaterBreathe());
    fish.breatheProcess();
  }
}
