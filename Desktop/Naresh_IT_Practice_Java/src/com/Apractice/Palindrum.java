package com.Apractice;

public class Palindrum {
	public static void main(String[] args) {
		
		int a=213;
		int rev=0;
		
		while(a!=0) {
			rev=rev*10+a%10;
			a=a/10;
		}
		if(213==rev) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
