package main.java.lld.stackoverflow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Question implements Votable, Commentable {
  private String id;
  private String title;
  private String content;
  private User author;
  private List<Answer> answers;
  private List<Comment> comments;
  private List<Tag> tags;
  private List<Vote> votes;
  private Date creationDate;

  public Question(User author, String title, String content, List<String> tagNames) {
    this.id = StackOverFlowUtil.generateId();
    this.author = author;
    this.title = title;
    this.content = content;
    this.creationDate = new Date();
    this.answers = new ArrayList<>();
    this.comments = new ArrayList<>();
    this.votes = new ArrayList<>();
    this.tags = new ArrayList<>();
    for (String tag : tagNames) {
      this.tags.add(new Tag(tag));
    }
  }

  public void addAnswer(Answer answer) {
    if (!answers.contains(answer)) {
      answers.add(answer);
    }
  }

  @Override
  public void addComment(Comment comment) {
    comments.add(comment);
  }

  @Override
  public List<Comment> getComments() {
    return this.comments;
  }

  @Override
  public void addVote(User user, int value) {
    if (value != 1 && value != -1) {
      throw new IllegalArgumentException("Vote value must be either 1 or -1");
    }
    votes.removeIf(v -> v.getUser().equals(user));
    votes.add(new Vote(user, value));
    author.updateReputation(value * User.QUESTION_REPUTATION);  // +5 for upvote, -5 for downvote
  }

  @Override
  public int getVoteCount() {
    return votes.stream().mapToInt(Vote::getValue).sum();
  }

  public String getId() {
    return id;
  }

  public List<Tag> getTags() {
    return tags;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }

  public User getAuthor() {
    return author;
  }
}
