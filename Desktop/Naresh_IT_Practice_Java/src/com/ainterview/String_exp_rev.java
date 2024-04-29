package com.ainterview;

public class String_exp_rev {
	public static void main(String[] args) {
		
		String s="Pune Mumbai Nagpur";
	    String[] sp=s.split(" ");
	    String rev="";
		
		for(int i=sp[2].length()-1;i>=0;i--) {
		rev=rev+sp[2].charAt(i);
		}
		System.out.println(rev);
	}

}
