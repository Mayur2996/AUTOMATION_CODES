package com.blocks;

public class Try_Catch1 {
	public static void main(String[] args) {
		try {
			int a=65/0;
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println("This is arithmetic exception");
		}
		finally {
			System.out.println("I am able to execute");
		}
	}

}
