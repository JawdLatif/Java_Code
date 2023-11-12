package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Class_Oct_5_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> studentDetails = new ArrayList<String>();
// Loops
		studentDetails.add("Liza");
		studentDetails.add("Bob");
		studentDetails.add("Adam");
		studentDetails.add("Marrya");
		studentDetails.add("Jullia");
		
//		Iterator Interface
		
		System.out.println("\n Iterator \n");
		
		Iterator s = studentDetails.iterator();
		
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		
//		ListIterator
		
		System.out.println("\n ListIterator \n");
		
		ListIterator<String> myList = studentDetails.listIterator();
		
		while (myList.hasNext()) {
			
			String studList = myList.next();{
				System.out.println(studList);
			}
			
		}
//			For Each Loop 
			System.out.println("\n Traversing list through For-Each loop \n");
			
			for (String  s1 : studentDetails) {
				
				System.out.println(s1);
			}
			
//			For-Each Method
		
			System.out.println("\n Traversing list through For-Each Method \n");
			
			studentDetails.forEach(st -> {
				System.out.println(st);
			});
			
			
			
//			For-Loop
		
			System.out.println("\n Traversing list through For-Loop \n");
			
			for (int i = 0; i < studentDetails.size(); i++) {
				System.out.println(studentDetails.get(i));
			}
			
//			forEachRemaining
			
			System.out.println("\n Traversing list through forEachRemaining method \n");	
			
			Iterator<String> sName = studentDetails.iterator();
			
			sName.forEachRemaining(s2->{
				System.out.println(s2);
			});
			
	}

}
