package com.corejava;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
//		short[] arr=new short[10];
//		System.out.println(arr.getClass().getName());
//		int[] marks= new int[10];
//		int marks[]= new int[10];  both will work
//		zero indexed
//		marks[0]=34;
//		marks[1]=45;
//		marks[2]=56;
//		for (int i =0;i<3;i++) {
//			System.out.println(marks[i]);
//		}
		
//		#######
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the size of array:-");
//	int size = sc.nextInt();
//	int score[] = new int[size];
//	System.out.println("Enter the Elements of array:-");
//	
//	for (int i=0;i<size;i++) {
//		score[i]=sc.nextInt();
//	}
//	System.out.println("The elements are:-");
//	
//	for (int j=0;j<size;j++) {
//		System.out.println(score[j]);
//	}

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array:-");
	int size = sc.nextInt();
	int score[] = new int[size];
	System.out.println("Enter the Elements of array:-");
	
	for (int i=0;i<size;i++) {
		score[i]=sc.nextInt();
	}
	System.out.println("Enter the Elements to find:-");
	int x =sc.nextInt();
	for (int k=0;k<score.length;k++) {
		if(score[k]==x) {
			System.out.println("x found at index no. " + k);
		}
	}
	
	}
}