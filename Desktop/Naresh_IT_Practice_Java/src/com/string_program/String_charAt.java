package com.string_program;

public class String_charAt {
	public static void main(String[] args) {
		String s="Selenium with Java";
		char a=s.charAt(3);
		System.out.println(a);
		System.out.println("=====");
	
		for(int i=0;i<s.length();i++) {
			char all=s.charAt(i);
			System.out.println(all);
		}
	}

}
