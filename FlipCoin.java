package org.ContractPod.Day5Programs;
import java.util.Scanner;;
public class FlipCoin 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of times to flip the coin: ");
		int noFlips = sc.nextInt();
		
		if (noFlips <= 0) 
		{
            System.out.println("Number of flips should be a positive integer.");
            return;
        }
		int heads =0;
		int tails =0;
		for(int i=0;i<noFlips;i++)
		{
			double random = Math.random();
			
			if(random<0.5)
			{
				tails++;
			}
			else
			{
				heads++;
			}
		}
		double percentageHeads = (double) heads / noFlips * 100;
        double percentageTails = (double) tails / noFlips * 100;
        
        System.out.println("Number of flips: " + noFlips);
        System.out.println("Number of heads: " + heads);
        System.out.println("Number of tails: " + tails);
        System.out.printf("Percentage of heads: %.2f%%\n", percentageHeads);
        System.out.printf("Percentage of tails: %.2f%%\n", percentageTails);

	}

}
