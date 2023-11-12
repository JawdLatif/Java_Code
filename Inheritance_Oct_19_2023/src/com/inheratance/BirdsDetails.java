package com.inheratance;

public class BirdsDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parrots obj = new Parrots ();
		System.out.println(obj.reproductions);
		System.out.println(obj.outerCovering );
		System.out.println(obj.flyUp());
		System.out.println(obj.flyDown());
		System.out.println(obj.name);
		System.out.println(obj.livingArea);
		System.out.println(obj.bill);
		System.out.println(obj.wings);
		System.out.println(obj.numberOfBird);
		
		
		System.out.println("*************Eagle*******");
		
		Eagle obj2 = new Eagle();
		System.out.println(obj2.reproductions);
		System.out.println(obj2.outerCovering);
		System.out.println(obj2.flyUp());
		System.out.println(obj2.flyDown());
		System.out.println(obj2.name);
		System.out.println(obj2.livingArea);
		
		System.out.println("**************");
		
		BabyEagle obj3 = new BabyEagle();
		System.out.println(obj3.reproductions);
		System.out.println(obj3.outerCovering);
		System.out.println(obj3.flyUp());
		System.out.println(obj3.flyDown());
		System.out.println(obj3.name);
		System.out.println(obj3.livingArea);
		System.out.println(obj3.color);
		System.out.println(obj3.flyinMounth());
		
	}

}
