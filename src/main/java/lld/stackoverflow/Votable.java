package main.java.lld.stackoverflow;

public interface Votable {
  void addVote(User user, int value);

  int getVoteCount();
}
