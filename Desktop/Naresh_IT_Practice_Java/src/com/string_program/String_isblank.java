package com.string_program;

public class String_isblank {
	public static void main(String[] args) {
		String s="";                  // ""- is blank // "a"-not blank character is present
		boolean a=s.isBlank();
		System.out.println(a);
		
		String s1="a";
		boolean b=s1.isBlank();
		System.out.println(b);
	
		if(b) {
			System.out.println("Blank");
		}
		else {
			System.out.println("Not Blank");
		}
	}

}
