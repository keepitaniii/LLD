package main.java.lld.designpattern.bridge;

public class TreeBreathe implements BreatheImplementor {
  @Override
  public void breathe() {
    System.out.println("Photosynthesis");
  }
}
