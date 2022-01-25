package com.hd.java;

/**Practical 19 : Program to find the index of an array element
 * @author Harsh
 * @version 1.0
 * @since 25-01-2022
 */
public class ArrayIndex {

	public static int arrayIndex(int numbers[], int element) {
		if (numbers == null) { // Check if array is null
			return 0;
		}
		int i = 0;
		while (i < numbers.length) { // Check the length of array
			if (numbers[i] == element) {
				return i;
			}
			else {
				i = i + 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] numbers = {5, 4, 6, 1, 3, 2, 7, 8, 9};
		System.out.println("Index position of 7 is: "+ arrayIndex(numbers, 7)); // Find the index of 5
		System.out.println("Index position of 9 is: "+ arrayIndex(numbers, 9)); // Find the index of 7
	}

}