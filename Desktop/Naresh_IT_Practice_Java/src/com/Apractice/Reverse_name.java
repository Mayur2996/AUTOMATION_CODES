package com.Apractice;

public class Reverse_name {
	public static void main(String[] args) {
		
		String s="I Love Hyderabad";
		System.out.println(s.replace(" ", ""));
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		
	}

}
