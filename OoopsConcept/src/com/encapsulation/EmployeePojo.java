package com.encapsulation;

//Java Bean(Pojo) is a fully encapsulated class because all the data members are private here.
public class EmployeePojo {

	private int employeeID;
	private String name;
	private long salary;
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
}
