package com.ainterview;

public class Upper_case1 {
	public static void main(String[] args) {
		
		String s="pune";
		String uc=s.substring(0, 1).toUpperCase()+s.substring(1, s.length());
		System.out.println(uc);
	}

}
