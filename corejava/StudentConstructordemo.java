package com.corejava;

public class StudentConstructordemo {
	String name;
	int rollno;
	
	

	public StudentConstructordemo(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}



	public static void main(String[] args) {
		StudentConstructordemo s1 = new StudentConstructordemo("shubham",01);
		StudentConstructordemo s2 = new StudentConstructordemo("rupali",02);
		System.out.println(s1.name+" " +s1.rollno);
		System.out.println(s2.name+" " +s2.rollno);
		
	

	}

}
