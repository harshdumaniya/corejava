package com.hd.core;

/**Practical 6 : example of a break/Continue statement
 * @author Harsh
 * @version 1.0
 * @since 24-01-2022
 */
public class BreakContinueExample {

	public static void main(String args[]) {
		for (int i = 1; i <= 10; i++) {
			if (i == 3) {
				continue;
			}
			if (i == 8) {
				break;
			}
			System.out.println(i);
		}
	}

}