package com.ainterview;

public class Array_max {
	public static void main(String[] args) {
		
		int[] a= {12,13,45,86,121,36};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
		
	}

}
