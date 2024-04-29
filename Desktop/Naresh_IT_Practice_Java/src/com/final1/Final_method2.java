package com.final1;

public class Final_method2 extends Final_method1 {
	public void car() {   // Found Error
		System.out.println("Car Run");
	}
	public static void main(String[] args) {
		Final_method2 b=new Final_method2();
		b.car();
		
		
	}

}
