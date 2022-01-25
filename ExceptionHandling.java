package com.hd.java;

/**
 * Practical 18 : Program to handle exceptions using try, catch, finally
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int[] numbers = {1, 2, 3};
			System.out.println(numbers[10]);
		} catch (Exception e) {
			System.out.println("something went wrong"); // Catch the Exception
		} finally {
			System.out.println("try catch is finished"); // It execute always
		}
	}

}