package main.java.lld.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
  private static Map<String, IRobot> roboticObjectCache = new HashMap<>();

  public static IRobot createRobot(String robotType) {
    if (roboticObjectCache.containsKey(robotType)) {
      return roboticObjectCache.get(robotType);
    } else {
      if (robotType.equals("HUMANOID")) {
        Sprites humanoidSprites = new Sprites();
        IRobot humanoidRobot = new HumanoidRobot(robotType, humanoidSprites);
        roboticObjectCache.put(robotType, humanoidRobot);
        return humanoidRobot;
      } else if (robotType.equals("ROBOTICDOG")) {
        Sprites roboticSprites = new Sprites();
        IRobot roboticDog = new RoboticDog(robotType, roboticSprites);
        roboticObjectCache.put(robotType, roboticDog);
        return roboticDog;
      }
    }
    return null;
  }
}
