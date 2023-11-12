package com.Zoo_Oct_12_2023;

public class Bird extends Mammalia implements Zoo{
	String name;
	String lifeCycle;
	String livingArea;
	public Bird(String lifeCycle, String livingArea, String name) {
		super(lifeCycle, livingArea);
		this.name = name;
		
	}
	
	

}
