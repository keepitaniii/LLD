package main.java.lld.designpattern.structural.bridge;

public class LandBreathe implements BreatheImplementor {
  @Override
  public void breathe() {
    System.out.println("Use lungs");
  }
}
