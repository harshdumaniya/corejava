package com.hd.core;

/**Practical 11 : Example of super keyword
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
class Animal { // Superclass

	public void animalSound() {
		System.out.println("Animal sound");
	}

}

class Lion extends Animal { // Subclass

	public void animalSound() {
		super.animalSound(); // Call the superclass method
		System.out.println("Lion is roaring");
	}

}

public class LionSound {

	public static void main(String[] args) {
		Lion myLion = new Lion(); // Create a Lion object
		myLion.animalSound(); // Call the method on the Lion object
	}

}