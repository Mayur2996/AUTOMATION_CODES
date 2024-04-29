package com.aapractice;

import java.util.Arrays;
import java.util.Collections;


public class Decending_orders {
	public static void main(String[] args) {
		Integer[] a= {1,9,6,3,2,5,7,4,8};
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}

}
