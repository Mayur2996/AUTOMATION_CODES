package com.hirarchical;

public class Class_C extends Class_A{
	
	public void bike() {
		System.out.println("This is bike Class C");
	}
    public static void main(String[] args) {
    	
    	Class_C c=new Class_C();
    	
    	c.Home();
    	c.bike();
	}
}
