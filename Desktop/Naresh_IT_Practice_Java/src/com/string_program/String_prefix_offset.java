package com.string_program;

public class String_prefix_offset {
	public static void main(String[] args) {
		String s="Selenium";
		boolean b=s.startsWith("e", 1);
		System.out.println(b);
		if(b) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
