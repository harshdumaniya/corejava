package com.hd.java;

import java.util.HashMap;

/**Practical 21 : Program using Map concepts
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
public class MapExample{

	public static void main(String[] args) {
		HashMap<String,String> fruitColour = new HashMap<String,String>(); // HashMap in <String,String> format
		fruitColour.put("Apple", "Red");
		fruitColour.put("Banana", "Yellow");
		fruitColour.put("Grapes", "Green");
		System.out.println(fruitColour); // Print the fruits and its colours
	}

}