package com.Apractice;

public class Duplicate_words {
	public static void main(String[] args) {
		
		String[] a= {"rubby","java","python","ruby"};
		boolean temp=false;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
					temp=true;
				}
			}
		}
	}

}
