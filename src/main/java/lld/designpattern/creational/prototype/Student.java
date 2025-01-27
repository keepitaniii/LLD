package main.java.lld.designpattern.creational.prototype;

public class Student implements Prototype {

  int age;
  String userName;
  private int rollNumber;

  Student(int age, String userName, int rollNumber) {
    this.age = age;
    this.userName = userName;
    this.rollNumber = rollNumber;
  }


  @Override
  public Prototype clone() {
    return new Student(age, userName, rollNumber);
  }
}
