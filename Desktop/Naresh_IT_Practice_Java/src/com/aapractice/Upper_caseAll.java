package com.aapractice;

public class Upper_caseAll {
	public static void main(String[] args) {
		String s="hyderabad pune mumbai";
		String[] sp=s.split(" ");
		for(String uc:sp) {
			System.out.println(uc.substring(0, 1).toUpperCase()+uc.substring(1, uc.length()));
			
			}
	}

}
