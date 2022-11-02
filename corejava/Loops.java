package com.corejava;
import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
//		for(initialisation;condition;updation)
		
//		int i = 0;   do while=works atlest once
//		do {
//			System.out.println(i++);
//		}while(i<11);
		
//		int i =4;  worked atleast once
//		do {
//			System.out.println(i++);
//		}while(1>i);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:- ");
		int size = sc.nextInt();
		int sum = 0;
		for(int i =0;i<=size;i++) {
			sum = sum+i;
		
		
		}
		System.out.println(sum);
		
	}
	

}
