package com.ArrayList;

import java.util.*;
public class Practice_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList <String> StudentsNames = new ArrayList<String>();
		ArrayList <String> studensNames = new ArrayList<String>();
//		add elements to the List
		studensNames.add("Liza");
		studensNames.add("Bob");
		studensNames.add("Adam");
		studensNames.add("Marrya");
		studensNames.add("Jullia");
		
//		Print all the list of Studens
		
		System.out.println(studensNames);
//		Getting the Single List
		System.out.println(studensNames.get(3));
//		adding an element in specific position
		studensNames.add(1,"Karim");
		System.out.println(studensNames);
		
//		Creat the second List of ArrayList
		ArrayList <String> Student2List = new ArrayList <String> ();
//		add elements to the List
		Student2List.add("Jahn");
		Student2List.add("Tahir");
		Student2List.add("Rahof");
//		Add second all the second List
		studensNames.addAll(Student2List);
//		Print all the List of students
		System.out.println(studensNames);
		
		for (String Stud : studensNames) {
			System.out.println(Stud);
		}
		
		
		
		
		 
		

	}

}
