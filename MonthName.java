package com.hd.core;

import java.util.Scanner;

/**Practical 3 : program to find the current month name from the given number
 * @author Harsh
 * @version 1.0
 * @since 24-01-2022
 */

public class MonthName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a month number"); // Enter a number
		int month = scanner.nextInt();
		
		switch (month) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			default: // Invalid output
				System.out.println("You entered wrong input number");
				break;
		}
	}

}