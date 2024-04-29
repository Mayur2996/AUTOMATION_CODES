package com.ainterview;

public class Print_max_value {
	
	public static void main(String[] args) {
		
		int[] a= {45,12,36,19,764};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
