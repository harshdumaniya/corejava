package com.hd.core;

/**
 * Practical 5 : program to make pattern using for loop
 * @author Harsh
 * @version 1.0
 * @since 24-01-2022
 */
public class Pattern {

	public static void main(String args[]) {
		for (int i = 0; i < 6; i++) { // Loop for row
			for (int j = 0; j <= i; j++) { // Loop for column
				System.out.print("*"); // Print stars
			}
			System.out.println(); // Throw cursour in new line
		}
	}

}