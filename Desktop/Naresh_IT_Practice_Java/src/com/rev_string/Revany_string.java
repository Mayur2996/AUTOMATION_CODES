package com.rev_string;

public class Revany_string {
	public static void main(String[] args) {
		
		String s="Hi Hello Mumbai";
		String[] sp=s.split(" ");
		
		
//		String fs=sp[0];
//		String se=sp[1];
//		String tr=sp[2];
//		
//		String name=new StringBuilder(tr).reverse().toString();
//		System.out.println(fs);
//		System.out.println(se);
//		System.out.println(name);
		
		String rev="";
		for(int i=sp[2].length()-1;i>=0;i--) {
			rev=rev+sp[2].charAt(i);
		}
		System.out.println(rev);
		
	}

}
