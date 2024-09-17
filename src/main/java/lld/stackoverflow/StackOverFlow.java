package main.java.lld.stackoverflow;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class StackOverFlow {
  private final Map<String, User> users;
  private final Map<String, Question> questions;
  private final Map<String, Answer> answers;
  private final Map<String, Tag> tags;

  public StackOverFlow() {
    users = new ConcurrentHashMap<>();
    questions = new ConcurrentHashMap<>();
    answers = new ConcurrentHashMap<>();
    tags = new ConcurrentHashMap<>();
  }

  public User createUser(String username, String email) {
    String id = String.valueOf(users.size() + 1);
    User user = new User(id, username, email);
    users.put(id, user);
    return user;
  }

  public Question askQuestion(User user, String title, String content, List<String> tags) {
    Question question = user.askQuestion(title, content, tags);
    questions.put(question.getId(), question);
    for (Tag tag : question.getTags()) {
      this.tags.putIfAbsent(tag.getName(), tag);
    }
    return question;
  }

  public Answer answerQuestion(User user, Question question, String content) {
    Answer answer = user.answerQuestion(question, content);
    answers.put(answer.getId(), answer);
    return answer;
  }

  public Comment addComment(User user, Commentable commentable, String content) {
    return user.addComment(commentable, content);
  }

  public void voteQuestion(User user, Question question, int value) {
    question.addVote(user, value);
  }

  public void voteAnswer(User user, Answer answer, int value) {
    answer.addVote(user, value);
  }

  public void acceptAnswer(Answer answer) {
    answer.markAsAccepted();
  }

  public List<Question> getQuestionsByUser(User user) {
    return user.getQuestions();
  }

  public List<Question> searchQuestions(String query) {
    return questions.values().stream()
      .filter(q -> q.getTitle().toLowerCase().contains(query.toLowerCase()) ||
        q.getContent().toLowerCase().contains(query.toLowerCase()) ||
        q.getTags().stream().anyMatch(t -> t.getName().equalsIgnoreCase(query)))
      .collect(Collectors.toList());
  }
}
