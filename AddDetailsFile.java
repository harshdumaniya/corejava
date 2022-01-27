package com.hd.java;

import java.io.FileWriter;

/**
 * Practical 24 : Program to add personal details in file
 * @author Harsh
 * @version 1.0
 * @since 27-01-2022
 */
public class AddDetailsFile {

	public static void main(String args[]) {
		try {
			FileWriter filewriter = new FileWriter("myTestFile.txt"); // Initialize File writer object and passing path as argument
			filewriter.write("Name : Harsh Dumaniya\n"); // Details to add in file
			filewriter.write("Role : Java Intern\n"); // Details to add in file
			filewriter.close(); // Close the filewriter
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Successfully Added");
	}

}