package com.control_Satment;


public class Grade {
	public String gradeShow() {
		int testScore = 90;
		String  grade;
		if(testScore > 90) {
			grade = "A";
		}else if (testScore>80) {
			grade = "B";
		}else if (testScore>70) {
			grade = "C";
		}else if (testScore>70) {
			grade = "D";
			}else { grade = "f";}
		
		
		return grade;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grade obj = new Grade();
		System.out.println(obj.gradeShow());

	}

}
