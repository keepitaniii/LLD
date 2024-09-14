package main.java.lld.librarymanagementsystem;

public abstract class Account {
  private String id;
  private String password;
  private AccountStatus accountStatus;
  private Person person;

  public String getId() {
    return id;
  }
}
