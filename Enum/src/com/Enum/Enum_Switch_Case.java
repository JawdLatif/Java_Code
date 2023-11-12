package com.Enum;

public class Enum_Switch_Case {
	enum level{
		LOW,
		MEDIUM,
		HIGH
	}

	public static void main(String[] args) {
		level myVar = level.HIGH;
		
		switch (myVar) {
		case LOW:
			System.out.println("This Level is Low");
			break;
		case MEDIUM:
			System.out.println("This level is MEDIUM");
			break;
		case HIGH:
			System.out.println("This level is HIGH");
			break;
		}

	}

}
