package com.Apractice;

public class Occurance_1 {
	public static void main(String[] args) {
		String s="java is programing language";
		int full=s.length();
		int rs=s.replaceAll(" ", "").length();
		int count=full-rs;
		System.out.println(count);
	}

}
