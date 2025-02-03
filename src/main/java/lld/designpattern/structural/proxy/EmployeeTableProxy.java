package main.java.lld.designpattern.structural.proxy;

public class EmployeeTableProxy implements EmployeeTable {
  EmployeeTable employeeImpl;

  EmployeeTableProxy() {
    this.employeeImpl = new EmployeeTableImpl();
  }

  @Override
  public void create(String client, Employee employee) throws Exception {
    if (client.equals("ADMIN")) {
      employeeImpl.create(client, employee);
      return;
    }
    throw new Exception("Access Denied");
  }

  @Override
  public void delete(String client, int employeeId) throws Exception {
    if (client.equals("ADMIN")) {
      employeeImpl.delete(client, employeeId);
      return;
    }
    throw new Exception("Access Denied");
  }

  @Override
  public Employee get(String client, int employeeId) throws Exception {
    if (client.equals("ADMIN") | client.equals("USER")) {
      return employeeImpl.get(client, employeeId);
    }
    throw new Exception();
  }
}
