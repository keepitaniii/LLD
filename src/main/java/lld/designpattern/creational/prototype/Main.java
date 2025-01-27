package main.java.lld.designpattern.creational.prototype;

public class Main {
  public static void main(String[] args) {
    Student obj = new Student(20, "Aniket", 75);
    Student cloneObj = (Student) obj.clone();
  }
}
