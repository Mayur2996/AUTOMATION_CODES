package com.scanner;

import java.util.Scanner;

public class Scanner_nextInt {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This is First Value");
		int a=sc.nextInt();
		
		System.out.println("This is Second Value");
		int b=sc.nextInt();
		
		int c=a+b;
		System.out.println("This is Answer: "+c);
		
	}

}
