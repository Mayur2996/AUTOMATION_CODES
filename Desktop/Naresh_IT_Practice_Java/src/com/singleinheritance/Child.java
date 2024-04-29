package com.singleinheritance;

public class Child extends Parrent{
	
	public static void main(String[] args) {
		
		Child c=new Child();
		
		System.out.println(c.a);        
		System.out.println(c.name);
		
		c.Hi();
		c.Hello();
		c.My("Selenium", 6);
	}

}
