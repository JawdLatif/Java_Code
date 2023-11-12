package com.Collections;

import java.util.ArrayList;

public class ArreyListExample {

	public static void main(String[] args) {
//		 collection Name + DataType + your Optional array name + = new + data type + constractor();
		
//		ArrayList 
		
		ArrayList <String> studensNames = new <String> ArrayList(); 
		
		studensNames.add("Karim");
		studensNames.add("Karim");
		studensNames.add("Sahar");
		studensNames.add("Hamid");
		studensNames.add("Tamana");
		studensNames.add("Jabar");
		
		studensNames.add(3, "Jamil");
		
		
		
		
		
		System.out.println(studensNames.remove(2));
		System.out.println(studensNames);
		System.out.println(studensNames.get(3));
		
		
		
		ArrayList <String> newStudentsList = new <String> ArrayList(); 
		
		
		newStudentsList.add("Shafa");
		newStudentsList.add("Rafa");
		newStudentsList.add("Mohib");
		newStudentsList.add("Rahof");
		newStudentsList.add("Shadqull");
		newStudentsList.add("Gull Jamal");
		
		
//		studensNames.addAll(newStudentsList);   or 
		
		studensNames.addAll(2, newStudentsList);
		
		
		System.out.println(studensNames);
		
		
		
// exp 2
		
		ArrayList <Integer> aptNumber = new <Integer> ArrayList();
		
		aptNumber.add(12);
		aptNumber.add(15);
		aptNumber.add(18);
		
//		Exp 3
		
		ArrayList <Boolean> studentsAttendance = new <Boolean> ArrayList();
		
		studentsAttendance.add(true);
		studentsAttendance.add(true);
		studentsAttendance.add(false);
		studentsAttendance.add(true);
		studentsAttendance.add(false);
		
		
		System.out.println(studentsAttendance.remove(2));
		System.out.println(studentsAttendance.get(2));
	}

}
