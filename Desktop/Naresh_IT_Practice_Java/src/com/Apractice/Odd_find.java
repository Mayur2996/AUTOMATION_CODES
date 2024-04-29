package com.Apractice;

public class Odd_find {
	public static void main(String[] args) {
		int[] a= {111,222,458,654,235};
		for(int odd:a) {
			if(odd%2!=0) {
				System.out.println(odd);
			}
		}
	}

}
