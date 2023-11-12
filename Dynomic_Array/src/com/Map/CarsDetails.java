package com.Map;
import java.util.*;
import java.util.Map.Entry;

public class CarsDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BMW_Map obj = new BMW_Map("BMW R", "I7", 2022, "BMW", 9000.00, "Black", "Hybarid");
		BMW_Map obj2 = new BMW_Map("BMW E", "P7", 2023, "BMW", 800.00, "Green", "Gas");
		BMW_Map obj3 = new BMW_Map("BMW B", "Q7", 2024, "BMW", 12090.99, "Yellow", "Electrical");
		BMW_Map obj4 = new BMW_Map("BMW D", "C7", 2021, "BMW", 509090.00, "Red", "Feul");
		
		Map<String, BMW_Map> cars = new HashMap<String, BMW_Map>();
		
		cars.put("A", obj);
		cars.put("B", obj2);
		cars.put("C", obj3);
		cars.put("D", obj4);
		
		for (Entry<String, BMW_Map> car : cars.entrySet()) {
			
			String keys = car.getKey();
			BMW_Map value = car.getValue();
			
			System.out.println(keys + " " + "Details");
			System.out.println(value.name + " "+ value.Company + "  "+ value.Model + " "+ 
			value.year + "  "+ value.EnginType + " "+ value.price);
			
			
		}
		
	}

}
