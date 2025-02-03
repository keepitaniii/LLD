package main.java.lld.designpattern.flyweight;

public class Main {
  public static void main(String[] args) {
    IRobot humanoidRobot1 = RobotFactory.createRobot("HUMANOID");
    humanoidRobot1.display(0, 0);

    IRobot roboticDog = RobotFactory.createRobot("ROBOTICDOG");
    roboticDog.display(1, 2);
  }

}
