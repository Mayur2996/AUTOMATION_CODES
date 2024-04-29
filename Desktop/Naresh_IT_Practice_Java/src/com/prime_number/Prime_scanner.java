package com.prime_number;

import java.util.Scanner;

public class Prime_scanner {
	
	int num;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Value");
		int num=sc.nextInt();
		
		
		for(int i=2;i<=num;i++) {
			int count=0;
			
		for(int j=2;j<i;j++) {
			if (i % j == 0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}
	}


	}


