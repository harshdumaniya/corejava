package com.hd.java;

/**Practical 14 : Program to demonstrate Encapsulation
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
class Employee {

	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class EmployeeDetails {

	public static void main(String args[]) {
		Employee employee = new Employee();
		employee.setId(100); // Set the Id
		employee.setName("Harsh"); // Set the Name
		employee.setAge(20); // Set the Age
		System.out.println("Id : " + employee.getId()); // Get the Id
		System.out.println("Name : " + employee.getName()); // Get the Name
		System.out.println("Age : " + employee.getAge()); // Get the Name
	}

}