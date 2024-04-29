package com.Apractice;

public class Strin_occurance {
	public static void main(String[] args) {
		String s="I Love My city";
		int a=s.length();
		int n=s.replaceAll("L", "").length();
		//System.out.println(n);
		int count=a-n;
		System.out.println(count);
	}

}
