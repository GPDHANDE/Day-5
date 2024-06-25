package org.ContractPod.Day5Programs;

import java.util.Scanner;

public class Swap2No 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the First Number");
		int num2 = sc.nextInt();
		System.out.println("Numbers before swapping "+num1 +" & "+num2);
		int temp =  num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Numbers after swapping "+num1 +" & "+num2);
	}

}
