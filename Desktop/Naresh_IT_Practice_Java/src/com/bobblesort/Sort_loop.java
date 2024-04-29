package com.bobblesort;

import java.util.Arrays;

public class Sort_loop {
	
	public static void main(String[] args) {
		
		int[] a= {9,8,7,4,5,6,1,2,3};
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					
					int k=a[j];
					a[j]=a[j+1];
					a[j+1]=k;
					
				}
				System.out.println(Arrays.toString(a));
			}
			
		}
	}

}
