package com.array;

public class Length_variable_array {
	
	public static void main(String[] args) {
	
	String[] data= {"Selenium","Java","Python"};
	
	for(int i=0;i<data.length;i++) {
		System.out.println(data[i]);
		}
	System.out.println(data.length);
	System.out.println("Length of Selenium :"+data[0].length());
	System.out.println("Length of Java :"+data[1].length());
	System.out.println("Length of Python :"+data[2].length());
	
	String rev="";
	
	for(int i=data[2].length()-1; i>=0; i--) {
		rev=rev+data[2].charAt(i);
	}
	
	System.out.println("Rverse String  :"+rev);
 } 
}
