package com.uppercase;

public class Test1 {
	public static void main(String[] args) {
		
		String s="I Love My India";
	    String empty="";
		String[] sp=s.split(" ");
		
		for(int i=sp[2].length()-1;i>=0;i--) {
			empty=empty+sp[2].charAt(i);
		}
		System.out.println(empty);
	}

}
