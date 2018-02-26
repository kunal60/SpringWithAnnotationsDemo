package com.info.demo3;

public class EmployeeServiceImpl implements EmployeeService {

	public void getEmployeebyNameAndId(int id, String name) {
		System.out.println("*****getEmployeebyNameAndId actual method ****");
		System.out.println("Emp Id " + id + " Name is " + name);
	}

	public void addEmployee() {
		System.out.println("One Employee Is addeded");
	}

	public void afterReturningDemo() {
		System.out.println("Hello");
	}

	public void afterAroundDemo() {
		System.out.println("Kunal");
	}

	public void afterThrowingDemo() {
		System.out.println("10/0");
		System.out.println(10/0);
	}
}
