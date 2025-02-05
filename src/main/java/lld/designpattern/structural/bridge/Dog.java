package main.java.lld.designpattern.structural.bridge;

public class Dog extends LivingThings {
  public Dog(BreatheImplementor breatheImplementor) {
    super(breatheImplementor);
  }

  @Override
  public void breatheProcess() {
    breatheImplementor.breathe();
  }
}
