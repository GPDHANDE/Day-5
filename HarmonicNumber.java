package org.ContractPod.Day5Programs;

import java.util.Scanner;

public class HarmonicNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		double harmonicNumber = 0.0;
        for (int i = 1; i <= n; i++) 
        {
            harmonicNumber = harmonicNumber +  1.0 / i;
        }
        System.out.println("The "+n+"th harmonic number is "+ harmonicNumber );

	}

}
