package com.ainterview;

public class Print_min_value {
	public static void main(String[] args) {
		

	int[]a= {1,2,3,4,5,6};
	int min=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	  }
	System.out.println(min);
	}
}
