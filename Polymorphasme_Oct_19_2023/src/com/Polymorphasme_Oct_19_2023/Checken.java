package com.Polymorphasme_Oct_19_2023;

public class Checken extends Bird {

	
//	injection
	Eagle eagle;
	String ShowDetails() {
		return flyup();
	}
	
	
	
	
	
	@Override
	String flyup() {
		// TODO Auto-generated method stub
		return "Checkent fly 10 meter high";
	}

	@Override
	String flydown() {
		// TODO Auto-generated method stub
		return "Checkent fly slow down";
	}

}
