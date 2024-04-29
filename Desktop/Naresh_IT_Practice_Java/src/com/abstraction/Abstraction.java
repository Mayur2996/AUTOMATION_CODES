package com.abstraction;

abstract class A{
	public abstract void run();    // incomplete
	public abstract void start();

}
class B extends A{
	public void run() {
		System.out.println("Run Method");
	}
	public void start() {
		System.out.println("Start Method");
	}

}


public class Abstraction {
	public static void main(String[] args) {
		B b=new B();
		b.run();
		b.start();
		
	}
}	