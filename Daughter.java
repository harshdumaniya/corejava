package com.hd.java;

/**
 * Practical 15.4 : Program to demonstrate Hybrid Inheritance
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
class GrandFather {

	public void view() { // Method decalration
		System.out.println("I am grandfather.");
	}

}

class Father extends GrandFather {

	public void view() { // Method decalration
		System.out.println("I am father.");
	}

}

class Son extends Father {

	public void view() { // Method decalration
		System.out.println("I am son.");
	}

}

public class Daughter extends Father {

	public void view() { // Method decalration
		System.out.println("I am a daughter.");
	}

	public static void main(String args[]) {
		Son son = new Son(); // Object of son class
		son.view();
	}

}