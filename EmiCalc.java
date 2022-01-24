package com.hd.core;

public class EmiCalc {

	public static void main(String[] args) {
		double principal = 10000, rate = 2 , time = 1, emi;
		emi= (principal * rate * Math.pow(1 + rate , time))/(Math.pow(1 + rate, time) - 1);
		System.out.println("Monthly EMI is :" +emi);
	}

}