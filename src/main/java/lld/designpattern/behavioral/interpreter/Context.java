package main.java.lld.designpattern.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
  Map<String, Integer> contextMap = new HashMap<>();

  public void put(String variable, int value) {
    contextMap.put(variable, value);
  }

  public int get(String key) {
    return contextMap.get(key);
  }
}
