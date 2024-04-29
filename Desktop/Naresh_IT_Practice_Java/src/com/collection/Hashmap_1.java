package com.collection;

import java.util.HashMap;

public class Hashmap_1 {
	
	public static void main(String[] args) {
		
		//Syntax
		HashMap<String,Integer> emp= new HashMap<String,Integer>();
		
		//Store data
		emp.put("Java", 11);
		emp.put("Rubby", 12);
		emp.put("Python", 13);
		emp.put("Selenium", 14);
		emp.put("Appium", 15);
		
		//get data
		System.out.println(emp.get("Java"));
		System.out.println(emp.get("Rubby"));
		
		
		// only get keys
		for(String emps:emp.keySet()) {
			System.out.println(emps);
		}
		//only get values
		for(Integer id:emp.values()) {
			System.out.println(id);
		}
	}

}
