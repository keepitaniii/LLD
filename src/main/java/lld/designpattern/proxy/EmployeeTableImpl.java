package main.java.lld.designpattern.proxy;

public class EmployeeTableImpl implements EmployeeTable {
  @Override
  public void create(String client, Employee employee) throws Exception {
    System.out.println("created new row in emp table");
  }

  @Override
  public void delete(String client, int employeeId) throws Exception {
    System.out.println("deleted row with id: " + employeeId);
  }

  @Override
  public Employee get(String client, int employeeId) throws Exception {
    System.out.println("get data from emplpoyee table");
    return new Employee();
  }
}
