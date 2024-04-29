package com.string_program;

public class String_isempty {
	public static void main(String[] args) {
		String s="";                   // ""-is empty // " "- not empty
		boolean a=s.isEmpty();
		System.out.println(a);
		if(a) {
			System.out.println("Its empty");
		}
		else {
			System.out.println("Its Not empty");
		}
	}

}
