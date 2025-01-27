package main.java.lld.designpattern.bridge;

public class LandBreathe implements BreatheImplementor {
  @Override
  public void breathe() {
    System.out.println("Use lungs");
  }
}
