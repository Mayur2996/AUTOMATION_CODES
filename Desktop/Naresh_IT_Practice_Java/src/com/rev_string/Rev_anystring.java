package com.rev_string;

public class Rev_anystring {
	public static void main(String[] args) {
		String s="My name is Mayur";
		String[] sp=s.split(" ");
		String rev="";
		
		for(int i=sp[2].length()-1;i>=0;i--) {
			rev=rev+sp[2].charAt(i);
		}
		System.out.println(rev);
	}


}
