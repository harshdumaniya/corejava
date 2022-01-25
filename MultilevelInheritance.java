package com.hd.java;

/**Practical 15.2 : Program to demonstrate Multilevel Inheritance
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
class CarName {

	public void carName() { // Method of Superclass
		System.out.println("Name : BMW ");
	}

}

class CarColour extends CarName {

	public void carColour() { // Method of Subclass
		System.out.println("Colour : Blue");
	}

}

class CarFuel extends CarColour {

	public void carFuel() { // Method of Subclass
		System.out.println("Fuel : Diesel");
	}
	
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		CarFuel car = new CarFuel(); // Object of Subclass
		car.carName();
		car.carColour();
		car.carFuel();
	}

}