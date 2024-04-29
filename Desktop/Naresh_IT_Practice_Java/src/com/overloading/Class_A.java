package com.overloading;

public class Class_A {   // Same Class,Same Method name,but Different Parameter
	
	public void truck(int a,int b) {
	    System.out.println("Truck 1 is Fast");
	}
	
	public void truck(String name,int c) {
		System.out.println("Truck 2 is Fast");
	}
	
	public static void main(String[] args) {
		Class_A a=new Class_A();
		a.truck(12, 56);
		a.truck("Tata", 2024);
	}
}
