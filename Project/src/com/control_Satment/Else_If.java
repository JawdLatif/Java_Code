package com.control_Satment;

public class Else_If {

	public String showGrade() {

		int testScore = 50;
		String grade;

		if (testScore > 90) {
			grade = "A";

		} else if (testScore > 80) {
			grade = "B";
		} else if (testScore > 70) {
			grade = "C";
		} else if (testScore > 60) {
			grade = "D";

		} else {
			grade = "Faild";

		}

		return grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Else_If obj = new Else_If();
		System.out.println(obj.showGrade());

	}

}
