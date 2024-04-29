package com.Apractice;

public class Reverse_specificword {
	public static void main(String[] args) {
		String s="I Love My Contry";
		String[] sp=s.split(" ");
		String rev="";
		for(int i=sp[3].length()-1;i>=0;i--) {
			rev=rev+sp[3].charAt(i);
		}
		System.out.println(rev);
	}

}
