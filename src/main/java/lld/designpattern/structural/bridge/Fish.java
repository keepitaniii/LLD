package main.java.lld.designpattern.structural.bridge;

public class Fish extends LivingThings {
  public Fish(BreatheImplementor breatheImplementor) {
    super(breatheImplementor);
  }

  @Override
  public void breatheProcess() {
    this.breatheImplementor.breathe();
  }
}
