package main.java.lld.designpattern.structural.bridge;

public class Tree extends LivingThings {
  public Tree(BreatheImplementor breatheImplementor) {
    super(breatheImplementor);
  }

  @Override
  public void breatheProcess() {
    this.breatheImplementor.breathe();
  }
}
