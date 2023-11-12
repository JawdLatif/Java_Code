package com.control_Satment;

public class SwichCase {
	public String ShowDayOfWeek() {
		int day = 2;
		String Weekday = null;
		
		switch (day) {
		case 1:
			Weekday = "Monday";
			break;
		case 2:
			Weekday = "Tuesday";
			break;
		case 3:
			Weekday = "Wednesday";
			break;
		case 4:
			Weekday = "Thursday";
			break;
		case 5:
			Weekday = "Friday";
			break;
		case 6:
			Weekday = "Saturday";
		break;
		case 7: 
			Weekday = "Sunday";
			break;
			
			default :
					Weekday= " Invalid Enter";
			break;
		
			
			
		
		
		}
		
		
		
		return Weekday;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwichCase obj = new SwichCase();
		System.out.println(obj.ShowDayOfWeek());

	}

}
