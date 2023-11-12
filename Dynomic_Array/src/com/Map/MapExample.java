package com.Map;

import java.util.*;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		list of soccer players wity jersy numbers

		HashMap<Integer, String> soccerPlayersDetails = new HashMap<Integer, String>();

		soccerPlayersDetails.put(7, "Ronaldo");
		soccerPlayersDetails.put(10, "Messi");
		soccerPlayersDetails.put(5, "Zaidan");
		soccerPlayersDetails.put(12, "Sahli");

//		Change the enters to set

		for (Entry<Integer, String> players : soccerPlayersDetails.entrySet()) {

			System.out.println(players.getKey() + " " + players.getValue());

//		Stream () use for reversed

		}
		System.out.println("===============================");
		HashMap<Integer, String> Countries = new HashMap<Integer, String>();

		Countries.put(93, "Afghanisna");
		Countries.put(98, "Iran");
		Countries.put(1, "USA");
		Countries.put(92, "UK");

		Countries.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println);

	}
}
