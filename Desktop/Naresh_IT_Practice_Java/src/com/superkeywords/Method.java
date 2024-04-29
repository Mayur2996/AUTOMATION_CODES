package com.superkeywords;


class AA{
	public void display() {
	System.out.println("Hello viewer");	
	}
	
}
class BB extends AA{
	public void display() {
		super.display();
		System.out.println("Hello learner");
		
	}
	
}

public class Method {
public static void main(String[] args) {
	BB b=new BB();
	b.display();
}
}
