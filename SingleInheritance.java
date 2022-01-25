package com.hd.java;

/**
 * Practical 15.1 : Program to demonstrate Single Inheritance
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
class Shape {

	public void myShape() { // Method of Superclass
		System.out.println("The shape is a ");
	}

}

class Circle extends Shape {

	public void myCircle() { // Method of Subclass
		System.out.println("circle");
	}

}

public class SingleInheritance {

	public static void main(String[] args) {
		Circle circle = new Circle(); // Object of Subclass
		circle.myShape();
		circle.myCircle();
	}

}