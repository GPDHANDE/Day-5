package org.ContractPod.Day5Programs;

import java.util.Scanner;

public class EvenOdd 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no to check whether is it even or odd");
		int n = sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Is is Even number");
		}
		else
		{
			System.out.println("Is is odd number");
		}
	}

}
