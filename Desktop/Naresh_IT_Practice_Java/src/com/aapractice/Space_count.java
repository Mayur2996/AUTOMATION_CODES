package com.aapractice;

public class Space_count {
	public static void main(String[] args) {
		String s="i love my county";
		int a=s.length();
		int b=s.replace(" ", "").length();
		int c=a-b;
		System.out.println(c);
	}

}
