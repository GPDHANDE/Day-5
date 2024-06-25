package org.ContractPod.Day5Programs;
import java.util.Scanner;
public class LeapYear 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year which you want to check whether it is leap year or not");
		int year = sc.nextInt();
		
		if(year>=1000 && year <= 9999)
		{
			if((year %4==0 && year %100!=0) || year %400==0)
			{
				System.out.println("It is a leap year");
			}
			else
			{
				System.out.println("It is not an leap year");
			}
		}
		else
		{
			System.out.println("Invalid input. Please enter a 4-digit year.");
		}

	}

}
