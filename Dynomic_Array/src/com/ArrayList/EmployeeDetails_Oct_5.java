package com.ArrayList;

import java.util.LinkedList;

public class EmployeeDetails_Oct_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee_Oct_5 obj1 = new Employee_Oct_5("Karim", "Samir", 23, "NY");
		Employee_Oct_5 obj2 = new Employee_Oct_5("Jabar", "Zahari", 30, "CA");
		Employee_Oct_5 obj3 = new Employee_Oct_5("Nawab", "Mazari", 35, "TX");
		Employee_Oct_5 obj4 = new Employee_Oct_5("Jafar", "Kabuli", 40, "VA");
		
		LinkedList<Employee_Oct_5> EmpolyeeLists = new LinkedList<Employee_Oct_5>(); 
		EmpolyeeLists.add(obj1);
		EmpolyeeLists.add(obj2);
		EmpolyeeLists.add(obj3);
		EmpolyeeLists.add(obj4);
		
		for(Employee_Oct_5 empl:EmpolyeeLists ) {
			System.out.println(empl.firsName + " " + empl.lastName + "  " + empl.age 
					+ "  "+ empl.address );
			
		}
	}

}
