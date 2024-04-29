package com.operation;

public class Demo2 {
	
	public void M1() {
		int a=12;
		int b=13;
		int c=a+b;
		System.out.println(c);
	}
	
	public void M2() {
		int d=22;
		int e=33;
		int f=e-d;
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.M1();
		d.M2();
	}

}
