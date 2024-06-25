package org.ContractPod.Day5Programs;

import java.util.Scanner;

public class Factors 
{
	public static void computePrimeFactors(int N) 
	{
        // Print the number of 2s that divide N
        while (N % 2 == 0) {
            System.out.print(2 + " ");
            N /= 2;
        }
        
        // N must be odd at this point, so we can skip even numbers
        for (int i = 3; i <= Math.sqrt(N); i += 2) {
            // While i divides N, print i and divide N
            while (N % i == 0) {
                System.out.print(i + " ");
                N /= i;
            }
        }
        if (N > 2) {
            System.out.print(N);
        }
        
        System.out.println(); // Print a new line after the factors
    }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number which you want to find the prime factors");
		int n = sc.nextInt();
		int count=0;
		computePrimeFactors(n);
	}

}
