package com.uppercase;

import java.util.Scanner;

public class Scanner_rev {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter First,Second,Third");
		String name=sc.nextLine();
		
		String[] full=name.split("\\s");
		
		String first=full[0];
		String second=full[1];
		String third=full[2];
		
		String names=new StringBuilder(third).reverse().toString();
		System.out.println(first);
		System.out.println(second);
		System.out.println( names);
		
	}

}
