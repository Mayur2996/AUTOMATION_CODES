package com.prime_number;

public class Prime_2 {
	
	public static void main(String[] args) {
		int num=50;
	
		for(int i=2;i<=num;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(i);
			
		}
	 }
	}
}
