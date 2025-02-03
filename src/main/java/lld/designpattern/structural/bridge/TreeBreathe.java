package main.java.lld.designpattern.structural.bridge;

public class TreeBreathe implements BreatheImplementor {
  @Override
  public void breathe() {
    System.out.println("Photosynthesis");
  }
}
