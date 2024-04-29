package com.Apractice;

public class Upper_first {
	public static void main(String[] args) {
		
		String s="pune";
		String[] sp=s.split(" ");
		
		String fs=s.substring(0, 1).toUpperCase();
		
		String remain=s.substring(1, s.length());
		String full=fs+remain;
		
		System.out.println(full);
	}

}
