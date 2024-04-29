package com.type_code;

public class Test3 {
	
	public void M1(int a) {
		System.out.println("This is Integer");
		
	}

    public void M2(String name ) {
    	System.out.println("This is String");
		
	}
    
    public void M3(int b,String name) {
    	System.out.println("This is Integer and String");
    	
    }
    
    public static void main(String[] args) {
    Test3 t= new Test3();
    	t.M1(10);
    	t.M2("Java");
    	t.M3(11, "Selenium");
    	
    
	}

}
