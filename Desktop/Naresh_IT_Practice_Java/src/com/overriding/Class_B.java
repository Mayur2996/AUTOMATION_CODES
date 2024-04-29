package com.overriding;

public class Class_B extends Class_A {

	public void Add(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	public void Add(String name,int c) {
		System.out.println(name);
		System.out.println(c);
    }
	
	public static void main(String[] args) {
		
		Class_B b=new  Class_B();
		 b.Add(30,15);
		 b.Add("Riyaz", 23);
		
	}
}