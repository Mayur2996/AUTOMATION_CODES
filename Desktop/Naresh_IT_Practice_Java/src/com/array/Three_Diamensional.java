package com.array;

public class Three_Diamensional {
	
	public static void main(String[] args) {
		
		int[][][] a= new int[2][3][4];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<4;k++) {
					a[i][j][k]=i+j+k;
				}
			}
		}
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<4;k++) {
					System.out.println(a[i][j][k]);
					
				}
			}
		}
		
		
	}

}
