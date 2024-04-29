package com.Apractice;

public class All_uppercase {
	public static void main(String[] args) {
		String s="msgg ayui eaika";
		String[] sp=s.split(" ");
		
		for(String all:sp) {
			System.out.println(all.substring(0, 1).toUpperCase()+all.substring(1,all.length()));
		}
	
	}
}
