package com.control_Satment;

public class Empoly_Level {
	public String level() {
		int promotionCode = 3;
		String level;
		if (promotionCode == 5) {
			level = "Level is One";

		} else if (promotionCode == 4) {
			level = "Level is Two";
		} else if (promotionCode == 3) {
			level = "Level is Three";
		} else {
			level = "Level is Four";
		}

		return level;
	}

	public static void main(String[] args) {

		Empoly_Level obj = new Empoly_Level();
		System.out.println("Your  "+ obj.level());

	}

}
