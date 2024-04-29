package com.palindrum;

public class New_1 {
	public static void main(String[] args) {
		int a=323;
		int rev=0;
		
		while(a!=0) {
			rev=rev*10+a%10;
			a=a/10;
		}
		if(323==rev) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
