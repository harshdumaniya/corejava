package com.hd.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Practical 23 : Program to demonstrate comparable comparator interface.
 * @author Harsh
 * @version 1.0
 * @since 27-01-2022
 */
class Player implements Comparable<Player> { // Implementing Player into Comparable

	private double rating;
	private String name;
	private int age;

	public int compareTo(Player player) { // Method of the Comparable
		return this.age;
	}

	public Player(String name, double rating, int age) {
		this.name = name; // Name of the player
		this.rating = rating; // Rating of the player
		this.age = age; // Age of the player
	}

	public double getRating() {
		return rating;
		}

	public String getName() {
		return name;
		}

	public int getAge() {
		return age;
		}

}

class AgeCompare implements Comparator<Player> { // Implementing class into Comparator

	public int compare(Player player1, Player player2) { // Compare age between two players
		if (player1.getRating() == player2.getRating()) {
			return 0;
		} else if (player1.getRating() > player2.getRating()) {
			return 1;
		} else {
			return -1;
		}
	}

}

class NameCompare implements Comparator<Player> { // Implementing class into Comparator

	public int compare(Player p1, Player p2) { // Compare Name between two players
		return p1.getName().compareTo(p2.getName());
	}

}

public class PlayerDetails {

	public static void main(String[] args) {
		ArrayList<Player> list = new ArrayList<Player>();
		list.add(new Player("M.S.Dhoni", 8.8, 36));
		list.add(new Player("Virat Kohli", 8.7, 29));
		list.add(new Player("Rohit Sharma", 8.6, 27));
		list.add(new Player("Shikhar Dhawan", 8.4, 30));
		list.add(new Player("Hardik Pandya", 7.9, 25));

		System.out.println("Sorted by Rating :"); // Player sorted by rating using comparable
		Collections.sort(list);
		for (Player player : list) {
		System.out.println(player.getRating() + " " + player.getName() + " " + player.getAge());
		}

		System.out.println("\nSorted by Age :"); // Player sorted by age using comparator
		AgeCompare ageCompare = new AgeCompare();
		Collections.sort(list, ageCompare);
		for (Player player : list) {
			System.out.println(player.getAge() + " " + player.getName() + " " + player.getRating());
		}

		System.out.println("\nSorted by name :"); // Player sorted by name using comparator
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		for (Player player : list) {
			System.out.println(player.getName() + " " + player.getRating()+ " " + player.getAge());
		}
	}

}