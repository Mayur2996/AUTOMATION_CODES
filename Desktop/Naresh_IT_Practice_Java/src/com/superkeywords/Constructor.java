package com.superkeywords;


class Animal{
	Animal(){
		System.out.println("This is Animal");
	}
}
class Dog extends Animal{
	Dog(){
		//super();
		System.out.println("This is Dog");
	}
	
}

public class Constructor {
public static void main(String[] args) {
	Dog d=new Dog();
}
}
