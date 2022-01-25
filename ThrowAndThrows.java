package com.hd.java;

/**Practical 18 : Program to handle exceptions using try, catch, finally, throw and throws
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
public class ThrowAndThrows {

	static void myAge(int age) throws ArithmeticException {
		if (age < 18) {
			throw new ArithmeticException("Access denied");
		} else {
			System.out.println("Access Granted");
		}
	}

	public static void main(String args[]) {
		try {
			myAge(18);
		} catch (ArithmeticException e) {
			System.out.println("something went wrong"); // Catch the thrown Exceptions from try
		} finally {
			System.out.println("thank you"); // Execute always
		}
	}

}