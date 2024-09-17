package main.java.lld.stackoverflow;

public class Comment {
  private String id;
  private User author;
  private String content;
  private int creationDate;
  private Vote vote;

  public Comment(User user, String content) {
    this.author = user;
    this.content = content;
  }
}
