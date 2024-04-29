package com.overriding;

public class Class_A {          // Same method name,same parameter but Different Class
	
	public void Add(int a,int b) {
	    int c=a+b;
		System.out.println(c);
	}
	
	public void Add(String name,int c) {
		System.out.println(name);
		System.out.println(c);
	}

}
