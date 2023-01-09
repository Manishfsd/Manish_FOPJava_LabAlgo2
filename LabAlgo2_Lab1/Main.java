package com.greatlearning;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int arr[],size,i;
		
		Scanner sc = new Scanner(System.in);
		
		PayMoney obj = new PayMoney();
		
		System.out.println("enter the size of transaction array");
		
		size = sc.nextInt();
		
		arr = new int [size];
		
		System.out.println("enter the values of array");
		
		for(i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		obj.moneyTransactions(arr);
	}

}
