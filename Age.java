package com.hd.core;

import java.util.Scanner;

/**Practical 2 : program to demonstrate the use of if/else statements
 * @author Harsh
 * @version 1.0
 * @since 24-01-2022
 */
public class Age {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");//enter age
		int age = scanner.nextInt();
		if (age > 18) {
			System.out.println("You are eligibe for voting");
		} else {
			System.out.println("You are not eligibe for voting");
		}
	}

}