package com.hd.java;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Practical 20 : Program to add string values in the list and print all the values using an iterator
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); // Object of list
		list.add("Hello"); // Add Value
		list.add("World"); // Add Value
		list.add("Harsh"); // Add Value
		Iterator<String> it = list.iterator(); // Iterator for print output
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
	}

}