package com.hd.core;

/**
 * Practical 9 : practical to compare two variables of Wrapper class using Wrapper classes.
 * @author Harsh
 * @version 1.0
 * @since 24-01-2022
 */
public class WrapperClass {

	public static void main(String args[]) {
		int a = 100;
		Integer intObject1 = new Integer(a);
		int b = 100;
		Integer intObject2 = new Integer(b);
		if (a == b) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
	}

}