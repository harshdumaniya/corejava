package com.hd.core;

/**
 * Practical 11 : example of a this variable
 * @author Harsh
 * @version 1.0
 * @since 24-01-2022
 */
class Person {

	int age;
	String name;
	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	void show() {
		System.out.println(age +" "+ name);
	}

}
class PersonDetails {

	public static void main(String args[]) {
		Person person1 = new Person(20, "Suresh");
		Person person2 = new Person(21, "Mahesh");
		person1.show();
		person2.show();
	}

}