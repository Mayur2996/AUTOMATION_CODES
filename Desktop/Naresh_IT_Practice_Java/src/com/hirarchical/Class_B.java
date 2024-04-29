package com.hirarchical;

public class Class_B extends Class_A{
	
	public void Car() {
		System.out.println("This is car Class B");
	}
    public static void main(String[] args) {
    	
    	Class_B b=new Class_B();
    	
    	b.Home();
    	b.Car();
  }
}
