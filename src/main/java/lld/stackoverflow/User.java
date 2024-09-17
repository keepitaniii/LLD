package main.java.lld.stackoverflow;

import java.util.ArrayList;
import java.util.List;

public class User {
  private String id;
  private String username;
  private String email;
  private int reputation;
  private List<Question> questions;
  private List<Answer> answers;
  private List<Comment> comments;

  public static final int QUESTION_REPUTATION = 5;
  public static final int ANSWER_REPUTATION = 10;
  public static final int COMMENT_REPUTATION = 2;

  public User(String id, String username, String email) {
    this.id = id;
    this.username = username;
    this.email = email;
    this.reputation = 0;
    this.questions = new ArrayList<>();
    this.answers = new ArrayList<>();
    this.comments = new ArrayList<>();
  }

  public Question askQuestion(String title, String content, List<String> tags) {
    Question question = new Question(this, title, content, tags);
    questions.add(question);
    updateReputation(QUESTION_REPUTATION);
    return question;
  }

  public Answer answerQuestion(Question question, String content) {
    Answer answer = new Answer(this, question, content);
    answers.add(answer);
    question.addAnswer(answer);
    updateReputation(ANSWER_REPUTATION);
    return answer;
  }

  public Comment addComment(Commentable commentable, String content) {
    Comment comment = new Comment(this, content);
    comments.add(comment);
    commentable.addComment(comment);
    updateReputation(COMMENT_REPUTATION);
    return comment;
  }

  public synchronized void updateReputation(int value) {
    this.reputation += value;
    if (this.reputation < 0) {
      this.reputation = 0;
    }
  }

  public int getReputation() {
    return reputation;
  }

  public String getUsername() {
    return username;
  }

  public List<Question> getQuestions() {
    return questions;
  }
}
