package com.uppercase;

public class First_Upp1 {
	public static void main(String[] args) {
		String s="selenium";
		String sa=s.substring(0, 1);
		System.out.println(sa);
		
		String remain=s.substring(1, s.length());
		String first=sa.toUpperCase();
		
		String full=first+remain;
		System.out.println(full);
		
		
	}

}
