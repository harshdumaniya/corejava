package com.hd.java;

/**Practical 13 : Program to demonstrate Abstraction
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
abstract class Vehicle {

	abstract void myVehicle(); // Method of abstract class

}

class Car extends Vehicle {

	void myVehicle() {
		System.out.println("Car is running safely"); // Call method of abstract class
	}

}

public class Abstraction {

	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		vehicle.myVehicle();
	}

}