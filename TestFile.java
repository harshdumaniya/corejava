package com.hd.java;

import java.io.File;
import java.io.IOException;

/**
 * Practical 24 : Program to create file
 * @author Harsh
 * @version 1.0
 * @since 27-01-2022
 */
public class TestFile {

	public static void main(String[] args) {
		File file = new File("myTestFile.txt"); // Initialize File object and passing path as argument
		boolean result;
		try {
			result = file.createNewFile(); // Creates a new file
			if (result) // Check that successfully created a new file
			{
				System.out.println("file created " + file.getCanonicalPath()); // Returns the path string
			} else {
				System.out.println("File already exist at location: " + file.getCanonicalPath());
			}
		} catch (IOException e) {
			e.printStackTrace(); //Prints exception if any
		}
	}

}