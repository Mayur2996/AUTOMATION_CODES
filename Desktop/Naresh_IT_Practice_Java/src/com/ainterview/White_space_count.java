package com.ainterview;

public class White_space_count {
	public static void main(String[] args) {
		String s="I Love My India njjhjh hvgvgv";
		int a=s.length();
		int b=s.replace(" ", "").length();
		int count=a-b;
		System.out.println(count);
	}

}
