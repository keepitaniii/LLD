package main.java.lld.designpattern.bridge;

public class WaterBreathe implements BreatheImplementor {
  @Override
  public void breathe() {
    System.out.println("Fish breathes through gills");
  }
}
