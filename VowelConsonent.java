package org.ContractPod.Day5Programs;

import java.util.Scanner;

public class VowelConsonent 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet which you want to check");
		//char c = sc.nextC
		char ch = sc.next().charAt(0);
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
		{
			if(ch == 'a' || ch=='e' || ch=='i' || ch =='o' || ch=='u'
					||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			{
				System.out.println(ch+" alphabet is vowel");
			}
			else
			{
				System.out.println(ch+" alphabet is Consonent");
			}
		}
		else
		{
			System.out.println("please enter valid input character");
		}
		
	}

}
