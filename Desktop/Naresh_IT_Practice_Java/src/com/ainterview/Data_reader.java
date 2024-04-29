package com.ainterview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Data_reader {
	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("C:\\Users\\mayur\\Desktop\\Documents.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str="";
		while((str=br.readLine())!=null){
			System.out.println(str);
			
		}
	}

}
