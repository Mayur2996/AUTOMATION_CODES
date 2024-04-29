package com.ainterview;

public class Array_min {
	public static void main(String[] args) {
		int[] a= {14,19,26,37,79};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
