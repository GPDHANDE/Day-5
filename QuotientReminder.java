package org.ContractPod.Day5Programs;

import java.util.Scanner;

public class QuotientReminder 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Dividend");
		int dividend = sc.nextInt();
		System.out.println("Enter the Divisor");
		int divisor = sc.nextInt();
		int reminder = dividend % divisor;
		int quotient = dividend/divisor;
		System.out.println("Divident: "+dividend);
		System.out.println("Divisor: "+divisor);
		System.out.println("Quotient: "+quotient);
		System.out.println("Reminder: "+reminder);
		
		
	}

}
