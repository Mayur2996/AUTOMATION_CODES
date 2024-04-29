package com.bobblesort;

import java.util.Arrays;
import java.util.Collections;

public class Bubble_decending {
	public static void main(String[] args) {
		
		Integer[] a= {2,5,8,6,4,7,3,9};
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}

}
