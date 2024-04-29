package com.ainterview;

public class Pali_12 {
	
	public static void main(String[] args) {
		
		int a=454;
		int rev=0;
		
		while(a!=0) {
			rev=rev*10+a%10;
			a=a/10;
		}
		if(454==rev) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
