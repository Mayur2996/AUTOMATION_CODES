package com.aapractice;

public class Upper_case {
	public static void main(String[] args) {
		String s="pune";
		String uc=s.substring(0,1).toUpperCase()+s.subSequence(1, s.length());
		System.out.println(uc);
	}

}
