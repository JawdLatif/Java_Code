package com.practice1;

public class Student_ten {

//	defualt constractor Jva

//	no argument constractor 
	public Student_ten() {

	}

//	 parametricde constractor

	public Student_ten(String name, int id) {

	}

//	Example

//	Empty Varible
	public String name;
	public int id;
	public String schoolName;

	public Student_ten(String name, int id, String schoolName) {
		this.name = name;
		this.id = id;
		this.schoolName = schoolName;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		object 

		Student_ten graduatedStudent = new Student_ten("Bahar", 33, "Harvard");
// invok 
		System.out.println(graduatedStudent.name);
		System.out.println(graduatedStudent.id);
		System.out.println(graduatedStudent.schoolName);

	}

}
