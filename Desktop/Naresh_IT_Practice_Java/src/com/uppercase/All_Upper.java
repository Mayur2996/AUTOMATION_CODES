package com.uppercase;

import java.util.Arrays;

public class All_Upper {
	
	public static void main(String[] args) {
		   
		String s="java core python";
		
		String[] str=s.split(" ");
		
		for(String word:str) {
			System.out.println(word.substring(0, 1).toUpperCase()+word.substring(1, word.length()));
			
		}
	}
}
