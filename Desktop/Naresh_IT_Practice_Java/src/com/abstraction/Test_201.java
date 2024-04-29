package com.abstraction;

public class Test_201 {
	public static void main(String[] args) {
		String[] s= {"Debesh","Mahesh","Ramesh"};
		String rev="";
		for(int i=s[2].length()-1;i>=0;i--) {
			rev=rev+s[2].charAt(i);
		}
		System.out.println(rev);
	
	}

}
