package com.hd.core;

public class StringMethods {

	public static void main(String[] args) {
		String carName = "bmw";
		String carColour = "red";
		System.out.println(carName.concat(carColour));
		System.out.println("\n");

		System.out.println(carName.charAt(0));
		System.out.println(carName.charAt(1));
		System.out.println(carName.charAt(2));
		System.out.println("\n");
		
		System.out.println(carName.equals(carColour));
	}

}
