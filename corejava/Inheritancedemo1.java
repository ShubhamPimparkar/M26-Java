package com.corejava;

public class Inheritancedemo1 {

	public static void main(String[] args) {
//		multiple inheritance can be achieved in java through interfaces
//		types of inheritance-
//		1. single
//		2. Multi level
//		3. hierarchical 
//		4. hybrid
		
//		# multiple inheritance is supported indirectly.
		
		
//		single inheritance codes-
		B obj = new B();
		obj.a = 20;
		obj.n = 30;
		obj.c = 40;
//		obj.display();
//		obj.show();
	
		Poly pp = new Poly();
//		pp.m();
//		pp.m(22);
//		pp.m(2.4);
		
//		automatic promotion-
//		byte -> short -> int -> long -> float -> double.
//		char -> int.
		pp.m('A');   // no string method inside class
		pp.m(3.4);
		
		
	}

}
class A{
	int a,n;
	void display() {
		System.out.println("Parent class"+a+n);
	}
}

class B extends A{
	int c;
	void show() {
		System.out.println("Child class"+c+a+n);
	}
}

//	polymorphism-
//	# two types:-
//	1. compile time/static/early binding  -> method overloading
//	same name/method but many tasks 

//	2. runtime / dynamic/late binding -> method overriding
// 	

// 	compile Time Poly-
class Poly{
	public void m() {
		System.out.println("No Args");
	}
	public void m(int i) {
		System.out.println("int Args");
	}
	public void m(double d) {
		System.out.println("double Args");
	}
}




