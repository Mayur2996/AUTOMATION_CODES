package com.array;

public class Two_diamensionalString {
	
	public static void main(String[] args) {
		
		String[][] a=new String[2][2];
		
		a[0][0]="Selenium";
		a[0][1]="CoreJava";
		a[1][0]="Manual";
		a[1][1]="API";
		
		System.out.println(a[0][1]);            // Array data
		System.out.println(a.length);           // size of array
		System.out.println(a[1][1].length());   // Length of a[1][1]
	}

}
