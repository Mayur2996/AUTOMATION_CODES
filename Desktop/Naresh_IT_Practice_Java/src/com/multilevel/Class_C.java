package com.multilevel;

public class Class_C extends Class_B{
	String name3="Java";
	
	public static void main(String[] args) {
		Class_C obj2= new Class_C();
		//Class A
		System.out.println(obj2.a);
		System.out.println(obj2.k);
		//Class B
		obj2.hi();
		obj2.hello("Jay", 26);
	}

}
