package com.hd.java;

/**Practical 16 : Program to demonstrate rum time polymorphism
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
class Fruit {

	void myFruit() {
		System.out.println("This is fruit");
	}

}

class Mango extends Fruit {

	void myFruit() { // Method of subclass to override superclass
		System.out.println("Mango is sour");
	}

	public static void main(String[] args) {
		Mango fruit = new Mango(); // Child object to the Parent object
		fruit.myFruit();
	}

}