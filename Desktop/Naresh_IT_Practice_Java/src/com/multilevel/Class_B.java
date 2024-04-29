package com.multilevel;

public class Class_B extends Class_A{
	
	int a=45;
	String k="New";
	
	public void gim() {
		String s="selenium";
		String p="Python";
		System.out.println(s);
		System.out.println(p);
	}
    public static void main(String[] args) {
    	
    	Class_B obj=new Class_B();
    	
    	System.out.println(obj.name1);
    	System.out.println(obj.name2);
    	obj.hi();
    	obj.hello("Hari", 25);
    	
    	
    	
	}
}
