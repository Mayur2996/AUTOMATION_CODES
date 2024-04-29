package com.final1;

public class Var_B{
	
	public void car() {
		final int speed=60;
		//speed=70;  // Found Error
		System.out.println(speed);
	}
	public static void main(String[] args) {
		Var_B b=new Var_B();
		b.car();
	}

}
