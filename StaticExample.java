package com.hd.core;

/**Practical 12 : Program to static methods, variables, and blocks
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
public class StaticExample {

	static int x = 20;
	static int y;

	static void myMethod(int z) {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}

	static {
		y = x + 10;
	}

	public static void main(String args[]) {
		myMethod(10);
	}

}