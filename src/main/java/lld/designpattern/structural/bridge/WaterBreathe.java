package main.java.lld.designpattern.structural.bridge;

public class WaterBreathe implements BreatheImplementor {
  @Override
  public void breathe() {
    System.out.println("Fish breathes through gills");
  }
}
