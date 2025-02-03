package main.java.lld.designpattern.structural.bridge;

public abstract class LivingThings {
  BreatheImplementor breatheImplementor;

  public LivingThings(BreatheImplementor breatheImplementor) {
    this.breatheImplementor = breatheImplementor;
  }

  abstract public void breatheProcess();

}
