package com.Array;

public class MultiDomintionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		fourmul one
		
		int numbers [] [] [] = new int[3][4][5];
		
		
//		fourmul two
		
		int numberstwo [] [ ] [] = {
				
				{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}		},
				{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}		},
				{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}		},
				
		};
		
		for (int x = 0; x < numberstwo.length; x++) {
			for(int y =0; y<numberstwo[x].length; y++) {
				for (int z =0; z<numberstwo[x][y].length; z++) {
					System.out.println(numberstwo [x] [y ] [z]);
				}
			}
			
		}
		
		

	}

}
