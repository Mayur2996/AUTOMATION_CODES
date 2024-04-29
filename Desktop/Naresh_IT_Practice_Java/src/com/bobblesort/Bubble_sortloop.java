package com.bobblesort;

import java.util.Arrays;

public class Bubble_sortloop {
	
	public static void main(String[] args) {
		int[] a= {2,5,8,6,4,7,3,9};
	// print order sort
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
