package com.hd.core;

/**Practical 7 : example of parameterized constructer
 * @author Harsh
 * @version 1.0
 * @since 24-01-2022
 */
public class SumCounstructer {
	
	int i = 10, j = 5, sum;
	public SumCounstructer() {
		sum = i + j;
	}

	public static void main(String args[]) {
		SumCounstructer scanner = new SumCounstructer();
		System.out.println(scanner.sum); // Print sum in the output
	}

}