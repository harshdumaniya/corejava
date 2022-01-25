package com.hd.java;

/**
 * Practical 17 : Write a program to demonstrate the interface
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
interface Animal {

	public void animalSound(); // Interface method
	public void lion(); // Interface method

}

class Lion implements Animal {

	public void animalSound() { // Call method from Sub class
		System.out.println("Animal sound");
	}

	public void lion() { // Call method from Sub class
		System.out.println("Lion is roaring");
	}

}

class Interface {

	public static void main(String args[]) {
		Lion myLion = new Lion(); // Created a lion object
		myLion.animalSound();
		myLion.lion();
	}

}