package com.hd.core;

import java.util.Scanner;

/**Practical 8 : emi calculater
 * @author Harsh
 * @version 1.0
 * @since 24-01-2022
 */
public class EmiCalc {

	public void calc(float p, float r, float t) {
		float principle = p;
		float rate = r;
		float time = t;
		
		rate = rate / (12 * 100);
		time = time * 12;
		float emi = (( p * r * (float) Math.pow (1 + r, t )) / ((float) Math.pow ( 1 + r, t ) -1 )); 
		System.out.print("EMI is: "+ emi +"\n");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the principle amount: "); // Principle amount
		float principle = scanner.nextFloat();

		System.out.print("Enter the rate of intrest:"); // Intrest rate
		float rate = scanner.nextFloat();

		System.out.print("Enter the time period:"); // Time in year
		float time = scanner.nextFloat();

		EmiCalc emi = new EmiCalc();
		emi.calc(principle, rate , time); // Calculate emi based on priciple amount,intrest rate and time
	}

}