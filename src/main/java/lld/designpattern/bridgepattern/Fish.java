package main.java.lld.designpattern.bridgepattern;

public class Fish extends LivingThings {
  public Fish(BreatheImplementor breatheImplementor) {
    super(breatheImplementor);
  }

  @Override
  public void breatheProcess() {
    this.breatheImplementor.breathe();
  }
}
