package main.java.lld.designpattern.structural.proxy;

public interface EmployeeTable {
  public void create(String client, Employee employee) throws Exception;
  public void delete(String client, int employeeId) throws Exception;
  public Employee get(String client, int employeeId) throws Exception;
}
