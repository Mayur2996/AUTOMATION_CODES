package com.superkeywords;

  class A {
	  int a=10;
	  }
 
 
  class B extends A{
	   int a=20;
	   public void show() {
		   System.out.println(super.a);
		   System.out.println(a);
	   }
  }

public class Variable {
	public static void main(String[] args) {
		B b= new B();
		b.show();
		
	}

}
