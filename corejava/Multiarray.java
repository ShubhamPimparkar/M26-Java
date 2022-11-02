package com.corejava;

public class Multiarray {

	public static void main(String[] args) {
//		variables without initialisation-
//		obj - null'
//		int - 0
//		bool - false
//		float - 0.0
//		string - " "
//		array lenght more then the input size gives array out of bound exeecption
		int[][] arr=new int[4][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[1];
		
		arr[3]=new int[1];	
		System.out.println(arr[1][1]);

	}
 
}
