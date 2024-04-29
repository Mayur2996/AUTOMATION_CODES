package com.uppercase;

public class Uppercase {
	public static void main(String[] args) {
		String s="java";
		String uc=s.substring(0, 1);
		String first=uc.toUpperCase();
		
		String remain=s.substring(1, s.length());
		String full=first+remain;
		System.out.println(full);
		
		
	}
}
