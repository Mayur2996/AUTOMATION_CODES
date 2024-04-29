package com.scanner;

import java.util.Scanner;

public class Scanner_Subs {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("First Value");
		int a=sc.nextInt();
		
		System.out.println("Second Value");
		int b=sc.nextInt();
		
		int c=a-b;
		System.out.println("Final Value:"+c);
	}

}
