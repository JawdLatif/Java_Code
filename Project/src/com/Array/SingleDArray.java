package com.Array;

public class SingleDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 Creat a list of names using Single Domand Array Both formula
		
//		First Way
//		Decalaration  ایجاد     Insttantiation تعین تعداد عناصر لیست 
		String names [] = new String[5];
//		Initialization قثمت دادن به لیست اری
		 names [0] = "Karim";
		 names [1] = "Tamim";
		 names [2] = "Hashim";
		 names [3] = "Zahair";
		 names [4] = "Mursal";

		 
		 
//		 System.out.println(names[3]);
//		 System.out.println(names.length);
		 
		 for (int a =0; a<names.length; a++) {
			 System.out.println(names [a]);
		 }
		 
		 for (String n:names) {
			 System.out.println(n);
		 }
		 
		 System.out.println("*************************\n");
		 
//		 Second way
		 
		 String StudentNames[] = {"Jamil", "Rafa", "Gull Jaml", "Dawud"};

//		 for Loop
		 
		 for (int a =0; a<StudentNames.length; a++) {
			 System.out.println(StudentNames [a]);
		 }
//		 foo each Loop
		 for (String n:StudentNames) {
			 System.out.println(n);
		 }
		 System.out.println("*************************\n");
		 
		 
	}

}
