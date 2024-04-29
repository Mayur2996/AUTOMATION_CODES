package com.uppercase;

public class Test2 {
	public static void main(String[] args) {
		
		String s="my name is Akshay";
		String[] a=s.split(" ");
		String empty="";
		
		for(int i=a[3].length()-1;i>=0;i--) {
			empty=empty+a[3].charAt(i);
		}
		System.out.println(empty);
	}

}
