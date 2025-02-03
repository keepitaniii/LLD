package main.java.lld.designpattern.structural.proxy;

public class Main {
  public static void main(String[] args) {
    try {
      EmployeeTable employeeTable = new EmployeeTableProxy();
      employeeTable.create("USER", new Employee());
      System.out.println("Completed");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
