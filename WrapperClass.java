package com.hd.core;

public class WrapperClass {
	
	public static void main(String args[]) {
		
		int a = 100;
		Integer intObject1 = new Integer(a);
		int b = 100;
		Integer intObject2= new Integer(b);
		
		if (a == b) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
		
	}

}