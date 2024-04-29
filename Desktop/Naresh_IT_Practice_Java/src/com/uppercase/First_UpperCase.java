package com.uppercase;

public class First_UpperCase {
	
	public static void main(String[] args) {
		
		String s ="selenium";  // Store the data
		String first=s.substring(0, 1);  // Print first letter UpperCase
		System.out.println(first);
		
		String remain=s.substring(1,s.length()); //print remain letter same
		String k=first.toUpperCase();  // add first name and remain
		
		String fullname=k+remain;
		System.out.println(fullname);
		
	}
	

}
