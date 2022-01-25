package com.hd.java;

import java.util.HashSet;

/**Practical 21 : Program using Set concepts
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
public class SetExample {

	public static void main(String[] args) {
		HashSet<String> city = new HashSet<String>(); // Create HashSet Object
		city.add("Ahmedabad");
		city.add("Baroda");
		city.add("Surat");
		city.add("Rajkot");
		city.add("Baroda");
		city.add("Ahmedabad");
		System.out.println(city); // Print the city
	}

}