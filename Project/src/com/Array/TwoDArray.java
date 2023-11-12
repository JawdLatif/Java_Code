package com.Array;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers [] [] = new int[3][4];
//		Row 0
		numbers [0] [0] =15;
		numbers [0] [1] = 16;
		numbers [0] [2] = 17;     
		numbers [0] [3] = 18;
//		Row 1
		numbers [1] [0] = 19;
		numbers [1] [1] = 20;
		numbers [1] [2] = 21;
		numbers [1] [3] = 22;
//		Row 2
		numbers [2] [0] =23;
		numbers [2] [1] = 24;
		numbers [2] [2] = 25;
		numbers [2] [3] = 26;
		
		
		int num [] []= { 
				
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		
		for (int a = 0; a< numbers.length; a++)
			for (int b = 0 ; b< numbers[a].length; b++ ) {
				System.out.println(numbers[a][b]);
			}
		System.out.println("***************\n");
		
//		for print we can use the (For Each Loop)
		
		for (int n[]:numbers )
			
			for (int m:n) {
				System.out.println(m);
			}
				

	}

}
