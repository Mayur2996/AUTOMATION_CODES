package com.blocks;

public class Try_Catch {
	public static void main(String[] args) {
		try {
			int a=45/0;
			System.out.println(a);
		}
		catch(Exception e){
			System.out.println("Catch the Exception");
		}

	}
}


