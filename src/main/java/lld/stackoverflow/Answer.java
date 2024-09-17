package main.java.lld.stackoverflow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Answer implements Votable, Commentable {
  private String id;
  private String content;
  private User author;
  private final Question question;
  private List<Comment> comments;
  private List<Vote> votes;
  private Date creationDate;
  private boolean isAccepted;

  public Answer(User author, Question question, String content) {
    this.id = StackOverFlowUtil.generateId();
    this.content = content;
    this.author = author;
    this.question = question;
    this.creationDate = new Date();
    this.comments = new ArrayList<>();
    this.votes = new ArrayList<>();
    this.isAccepted = false;
  }

  public void markAsAccepted() {
    if (isAccepted) {
      throw new IllegalStateException("This answer is already accepted");
    }
    isAccepted = true;
    author.updateReputation(User.ANSWER_REPUTATION);
  }

  @Override
  public void addComment(Comment comment) {
    comments.add(comment);
  }

  @Override
  public List<Comment> getComments() {
    return comments;
  }

  @Override
  public void addVote(User user, int value) {
    if (value != 1 && value != -1) {
      throw new IllegalArgumentException("Vote value must be either 1 or -1");
    }
    votes.removeIf(v -> v.getUser().equals(user));
    votes.add(new Vote(user, value));
    author.updateReputation(value * User.ANSWER_REPUTATION);  // +10 for upvote, -10 for downvote
  }

  @Override
  public int getVoteCount() {
    return votes.stream().mapToInt(Vote::getValue).sum();
  }

  public String getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public User getAuthor() {
    return author;
  }

  public boolean isAccepted() {
    return isAccepted;
  }
}
