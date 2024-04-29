package com.palindrum;

public class New_2 {
	public static void main(String[] args) {
		
		int a=455;
		int rev=0;
		
		while(a!=0) {
			rev=rev*10+a%10;
			a=a/10;
		}
		if(455==rev) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
