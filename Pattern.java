package com.hd.core;

/**Practical 5 : program to make pattern using for loop
 * @author Harsh
 * @version 1.0
 * @since 24-01-2022
 */
public class Pattern {

	public static void main(String args[]) {
		for (int i = 0; i < 6; i++)//loop for row
		{
			for (int j = 0; j <= i; j++)//loop for column
			{
				System.out.print("*");//print stars
			}
			System.out.println();//throw cursour in new line
		}
	}

}