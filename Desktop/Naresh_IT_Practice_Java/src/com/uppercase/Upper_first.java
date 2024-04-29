package com.uppercase;

public class Upper_first {
	public static void main(String[] args) {
	
		String s= "core";
		String sr=s.substring(0, 1);
		System.out.println(sr);
		
		String remain=s.substring(1, s.length());
		String first=sr.toUpperCase();
		
		String full=first+remain;
		System.out.println(full);
		
		
	
	}

}
