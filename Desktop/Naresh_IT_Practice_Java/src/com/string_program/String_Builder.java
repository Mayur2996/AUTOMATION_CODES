package com.string_program;

public class String_Builder {
	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder("Hello");
		sb.append(" Java");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.insert(0, "A");
		System.out.println(sb);
		
	}

}
