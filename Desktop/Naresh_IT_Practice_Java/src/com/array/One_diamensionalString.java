package com.array;

public class One_diamensionalString {
	
	public static void main(String[] args) {
		
		String[] a= new String[5];
		
		a[0]="Java";
		a[1]="Selenium";
		a[2]="Cucumber";
		a[3]="API";
		a[4]="Manual";
		
		System.out.println(a[2]);
		System.out.println(a.length);      // size of array
		System.out.println(a[1].length()); // length of Selenium index a[1]
	}

}
