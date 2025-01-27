package main.java.lld.designpattern.bridgepattern;

public class TreeBreathe implements BreatheImplementor {
  @Override
  public void breathe() {
    System.out.println("Photosynthesis");
  }
}
