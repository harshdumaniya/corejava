package com.hd.java;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Practical 23 : Program to demonstrate comparable comparator interface .
 * @author Harsh
 * @version 1.0
 * @since 27-01-2022
 */
class Product implements Comparable<Product> {

	String name;
	float price;
	int year;

	Product(String name, float price, int year) {
		this.name = name;
		this.price = price;
		this.year = year;
	}

	public int compareTo(Product product) {
		if (year == product.year) {
			return 0;
		} else if (year > product.year) {
			return 1;
		} else {
			return -1;
		}
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public int getYear() {
		return year;
	}

}

public class ProductDetails {

	public static void main(String args[]) {
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product("Biscuit", 50, 2021));
		list.add(new Product("Milk", 40, 2022));
		list.add(new Product("Shampoo", 160, 2019));
		list.add(new Product("Soap", 120, 2018));

		Collections.sort(list);
		for (Product product : list) {
			System.out.println(product.getName() + " " + product.getPrice() + " " + product.getYear());
		}
	}

}