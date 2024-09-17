package main.java.lld.stackoverflow;

public class Tag {
  private String id;
  private String name;

  public Tag(String tagName) {
    this.id = StackOverFlowUtil.generateId();
    this.name = tagName;
  }

  public String getName() {
    return name;
  }
}
