package com.rev_string;

public class Reverse_numb {
	public static void main(String[] args) {
		int a=456;
		int rev=0;
		while(a!=0) {
			rev=rev*10+a%10;
			a=a/10;
		}
		System.out.println(rev);
	}

}
