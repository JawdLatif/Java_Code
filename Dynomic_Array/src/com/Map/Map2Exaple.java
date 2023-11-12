package com.Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map2Exaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<Integer, String> soccerPlayersDetails = new HashMap<Integer, String>(); 
		
		soccerPlayersDetails.put(7, "Ronaldo");
		soccerPlayersDetails.put(10, "Messi");
		soccerPlayersDetails.put(5, "Zaidan");
		soccerPlayersDetails.put(12, "Sahli");
		
		
		for(Entry <Integer, String>  players : soccerPlayersDetails.entrySet()){
			 System.out.println(players.getKey() + "  " + players.getValue());
			
		}
	}

}
