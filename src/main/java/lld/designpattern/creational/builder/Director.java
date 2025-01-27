package main.java.lld.designpattern.creational.builder;

public class Director {
  StudentBuilder studentBuilder;

  Director(StudentBuilder studentBuilder) {
    this.studentBuilder = studentBuilder;
  }

  public Student createStudent() {
    if (studentBuilder instanceof EngineeringStudentBuilder) {
      return createEngineeringStudent();
    } else if (studentBuilder instanceof MBAStudentBuilder) {
      return createMBAStudent();
    }
    return null;
  }

  private Student createMBAStudent() {
    return studentBuilder.setRollNumber(1).setAge(26).setName("Aniii").setSubjects().build();
  }

  private Student createEngineeringStudent() {
    return studentBuilder.setRollNumber(2).setAge(22).setName("Ayush").setSubjects().build();
  }
}
