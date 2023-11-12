package com.Zoo_Oct_12_2023;

import java.util.*;
import java.util.Insects;
public class Animals_Details {
 
	public static void main(String[] args) {
		
		Bird bird1 = new Bird("Engle", "15 years", "Gangles");
		Bird bird2 = new Bird("Pegen", "10 years", "City");
		
		LinkedList<Bird> BirdList = new LinkedList<Bird>();
		BirdList.add(bird1);
		BirdList.add(bird2);
		
		
		for(Bird b:BirdList) {
			System.out.println(b.name + "  " + b.lifeCycle + " " + b.livingArea);
		}
		
		System.out.println("***********************\n");
		
		
		Reptiles Reit = new Reptiles("Fly","33", "sea");
		Reptiles Reit1 = new Reptiles(null, null, null)
	
		}
		
	}
	
	
	