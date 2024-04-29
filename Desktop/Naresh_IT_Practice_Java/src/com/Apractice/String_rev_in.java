package com.Apractice;

public class String_rev_in {
	public static void main(String[] args) {
		
	
	String s="I Love My India";
	String[] sp=s.split(" ");
	String rev="";
	for(int i=sp[3].length()-1;i>=0;i--) {
		rev=rev+sp[3].charAt(i);
	}
	System.out.println(rev);
	}
}
