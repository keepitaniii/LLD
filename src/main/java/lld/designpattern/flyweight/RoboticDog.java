package main.java.lld.designpattern.flyweight;

public class RoboticDog implements IRobot {
  private String type;
  private Sprites body;

  public RoboticDog(String type, Sprites body) {
    this.type = type;
    this.body = body;
  }

  @Override
  public void display(int x, int y) {

  }

  public Sprites getBody() {
    return body;
  }

  public String getType() {
    return type;
  }
}
