package com.hd.core;

import java.util.Scanner;

public class EmiCalc {

	public void calc(float p,float r,float t) {
		float principle = p;
		float rate = r;
		float time = t;
		
		rate = rate / (12 * 100);
		time = time * 12;
		float emi = (( p * r * (float) Math.pow (1 + r, t )) / ((float) Math.pow ( 1 + r, t ) -1 )); 
		System.out.print("EMI is: "+emi+"\n");
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the principle amount: ");
		float principle = sc.nextFloat();

		System.out.print("Enter the rate of intrest:");
		float rate = sc.nextFloat();

		System.out.print("Enter the time period:");
		float time = sc.nextFloat();

		EmiCalc emi = new EmiCalc();
		emi.calc(principle,rate,time);
	}

}