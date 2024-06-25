package org.ContractPod.Day5Programs;

import java.util.Scanner;

public class PowerOf2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=0 && n<31)
		{
			for(int i=0;i<=n;i++)
			{
				System.out.println("2 ^ "+i+" = "+Math.pow(2, i));
				
			}
		}
		else
		{
			System.out.println("N should be within the range 0 <= N < 31.");
		}
		
	}

}
