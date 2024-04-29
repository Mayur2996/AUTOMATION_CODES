package com.collection;

import java.util.HashSet;

public class Hashset_1 {
	public static void main(String[] args) {
		HashSet<Integer> empid=new HashSet<Integer>();
	
		empid.add(21);
		empid.add(31);
		empid.add(41);
		empid.add(51);
		empid.add(21);
		
        
		//print all empid
		for(Integer a:empid) {
			System.out.println(a);
		}
		System.out.println();
	
		//remove id
		empid.remove(31);
		for(Integer a:empid) {
			System.out.println(a);
		}
	
		//condition
		if(empid.contains(31)) {
			System.out.println("Available");
		}
		else {
			System.out.println("Not Available");
		}
	}

}
