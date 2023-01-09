package com.greatlearning;

import java.util.Scanner;

public class PayMoney {

	public void moneyTransactions(int[] arr) {
		
		int target;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the total no of targets that needs to be achieved");
		
		target = sc.nextInt();
		
	while(target-- != 0) {
		
		int flag = 0;
		 long value;
		 long sum = 0;
		 
		 System.out.println("enter the value of target");
		 
		 value= sc.nextInt();
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 sum += arr[i];
			 
			 if(sum >=value) {
				 System.out.println("Target achived after "+(i+1) + "transaction ");
				 System.out.println();
				 flag = 1;
				 break;
			 }
		 }
		 if(flag==0) {
			 System.out.println("Given taget is not achived!!");
		 }
	}
		
	}

}
