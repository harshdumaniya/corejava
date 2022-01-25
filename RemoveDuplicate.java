package com.hd.java;

import java.util.ArrayList;
import java.util.HashSet;

/**Practical 22 : Prepare list and remove duplicate values of the list.
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<String> characters = new ArrayList<String>(); // ArrayList object for preapare list
		characters.add("A");
		characters.add("B");
		characters.add("C");
		characters.add("D");
		characters.add("A");
		characters.add("C");
		characters.add("E");
		characters.add("E");
		characters.add("E");

		HashSet<String> set = new HashSet<String>(characters); // Convert ArrayLIst into HashSet to remove duplicates
		System.out.println(set);
	}

}