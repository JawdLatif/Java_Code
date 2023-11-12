package com.OOp;

public class AnimalsDetials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************Hors************\n");
		Animal Hrs1 = new Hors();
		System.out.println(Hrs1.move());
		System.out.println(Hrs1.eat());
		Hrs1.details();
		System.out.println("*************Bird************\n");
		Animal bird1 = new Bird();
		System.out.println(bird1.move());
		System.out.println(bird1.eat());
		bird1.details();
		System.out.println("*************Lion************\n");
		Animal Lion1 = new Lion();
		System.out.println(Lion1.move());
		System.out.println(Lion1.eat());
		Lion1.details();
		

	}

}
