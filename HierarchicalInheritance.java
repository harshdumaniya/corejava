package com.hd.java;

/**Practical 15.3 : Program to demonstrate Hierarchical Inheritance
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
class Bike {

	public void myBike() { // Method of SuperClass
		System.out.println("running");
	}

}

class Honda extends Bike {

	public void honda() { // Method of SubClass
		System.out.println("honda bike is");
	}

}

class Hero extends Bike {

	public void hero() { // Method of SuperClass
		System.out.println("hero bike is ");
	}
	
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Hero bike1 = new Hero(); // Object of Hero class
		bike1.hero();
		bike1.myBike();
		Honda bike2 = new Honda(); // Object of Honda class
		bike2.honda();
		bike2.myBike();
	}

}