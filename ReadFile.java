package com.hd.java;

import java.io.FileReader;

/**
 * Practical 25 : Program to read from file
 * @author Harsh
 * @version 1.0
 * @since 27-01-2022
 */
public class ReadFile {

	public static void main(String args[]) throws Exception {
		FileReader fileReader = new FileReader("myTestFile.txt"); // Initialize file object in FileReader

			int i;
			while((i = fileReader.read()) != -1) {
				System.out.print((char)i); // Read file and print it into String
		}
			fileReader.close();
	}

}