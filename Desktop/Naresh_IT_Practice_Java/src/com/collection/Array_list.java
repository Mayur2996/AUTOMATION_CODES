package com.collection;

import java.util.ArrayList;

public class Array_list {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();   //Duplicate allowed
		
		al.add("name1");
		al.add("name2");
		al.add("name3");
		al.add("name1");
		
		
		System.out.println(al);
	
		al.remove(1);
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		System.out.println(al.set(0, "name4"));
		System.out.println(al);
		
		
		
	}

}
