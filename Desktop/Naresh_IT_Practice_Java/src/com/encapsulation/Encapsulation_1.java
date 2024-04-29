package com.encapsulation;

public class Encapsulation_1 {
	
	private String stu_name;
	private int stu_batch;
	private int stu_id;
	
	public void setname(String name) {
		this.stu_name=name;
	}
	public String getname() {
		return stu_name;
	}
	
	public void setbatch(int batch) {
		this.stu_batch=batch;
	}
	public int getbatch() {
		return stu_batch;
	}
	
	public void setid(int id) {
		this.stu_id=id;
	}
	public int getid() {
		return stu_id;
	}
	
	public static void main(String[] args) {
		Encapsulation_1 e=new Encapsulation_1();
		
		e.setname("Riyaz");
		e.setbatch(2013);
		e.setid(1);
		
		
		System.out.println(e.getname());
		System.out.println(e.getbatch());
		System.out.println(e.getid());
		
	}

}
