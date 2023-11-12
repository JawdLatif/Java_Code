package com.control_Satment;

public class Switch_Practice {
	
	public String ShowWeekday() {
		int day = 7;
		String Today = null;
		
		switch (day){
			case 1:
				Today = "Monday";
				break; 
			case 2:
				Today = "Tuesday";
				break;
			case 3:
				Today = "Wednesday";
				break;
			case 4:
				Today = "Thursday";
				break;
			case 5:
				Today = "Friday";
				break;
			case 6:
				Today = "Saturday";
				break;
			case 7:
				Today = "Sunday";
				break;
				
				default: 
					Today = "Invalid Enter";
					break;
		
		}
		return Today;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch_Practice obj = new Switch_Practice();
		System.out.println(obj.ShowWeekday());

	}

}
