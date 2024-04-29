package com.brake_contineu;

public class Contineu_1 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			if(i==7) {                  // 7 is skip by condition
				continue;
			}
			System.out.println(i);
		}
	}

}
