package com.control_Satment;

public class Switch_Case {

	public String ShowDay() {
		int day = 7;
		String weekday = null;

		switch (day) {
		case 1:
			weekday = "Monday";
			break;
		case 2:
			weekday = "Tuesday";
			break;
		case 3:
			weekday = "Wednesday";
			break;
		case 4:
			weekday = "Thursday";
			break;
		case 5:
			weekday = "Friday";
			break;
		case 6:
			weekday = "Saturday";
			break;
		case 7:
			weekday = "Sunday";
			break;
			
			default : 
				weekday = "Invalid day of week";
				break;

		}

		return weekday;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Switch_Case obj = new Switch_Case();
		System.out.println(obj.ShowDay());

	}

}
