package com.hd.java;

/**Practical 16 : Program to demonstrate compile time polymorphism
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
public class Polymorphism {

	public void mySum(int number1, int number2) { // Method declaration
		System.out.println(number1 + number2); // Parameters
	}

	public void mySum(int number1, int number2, int number3) { // Method declaration
		System.out.println(number1 + number2 + number3); // Parameters
	}

	public static void main(String[] args) {
		Polymorphism sum = new Polymorphism();
		sum.mySum(11, 11);
		sum.mySum(11, 11, 11);
	}

}