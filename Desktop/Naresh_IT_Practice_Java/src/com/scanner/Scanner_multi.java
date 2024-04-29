package com.scanner;

import java.util.Scanner;

public class Scanner_multi {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First Value");
		int a=sc.nextInt();
		
		System.out.println("Second Value");
		int b=sc.nextInt();
		
		System.out.println("Third Value");
		int c=sc.nextInt();
		
		int d=a*b*c;
		System.out.println("Final Value:"+d);
	}

}
