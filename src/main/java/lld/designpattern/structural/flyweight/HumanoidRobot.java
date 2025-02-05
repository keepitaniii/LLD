package main.java.lld.designpattern.structural.flyweight;

public class HumanoidRobot implements IRobot {
  private String type;
  private Sprites body;

  HumanoidRobot(String type, Sprites body) {
    this.type = type;
    this.body = body;
  }

  @Override
  public void display(int x, int y) {

  }

  public String getType() {
    return type;
  }

  public Sprites getBody() {
    return body;
  }
}
