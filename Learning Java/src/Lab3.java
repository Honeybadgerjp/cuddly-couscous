/*
 * Jose Peregrina
 * Lab3.java
 * This programs calculates interest based on random method and declares odd or even from user input.
 * CSE- Lab #3
 * Time Spent: 1hr 2min
 */

import java.util.Random;
import java.util.Scanner;

public class Lab3 extends Strings 
{
	public static void main(String[] args)
	{
		double principle;
		double time;
		String str;
		int len;
		int interestRate = 0;
		double si;
		// simple interest
		Random luck = new Random();
		// Getting random interger
		int fate;
		Scanner in = new Scanner(System.in);
		
		fate = luck.nextInt(6) + 1;
		// getting the random number to be 1 thru 5
		
		if (fate < 3)
		{
			interestRate = 5;
			
		}
		else if (fate >= 3 || fate < 5)
		{
			interestRate = 10;
		}
		else if (fate >= 5)
		{
			interestRate = 15;
		}
		// conditions to find interest rate
		
		System.out.print("Enter the amount");
		principle = in.nextDouble();
		// declares initial amount
		
		System.out.print("Enter the time");
		time = in.nextDouble();
		// declares time
		
		System.out.print("Enter the string");
		in.nextLine();
		str = in.nextLine();
		//declares string
		
		si = (principle * time * interestRate) / 100;
		System.out.println("simple intrest: " + si);
		// calculates simple interest
		System.out.println("The intrest rate is: " + interestRate);
		
		len = str.length();
		// calculates length of string
		if (len % 2 == 0)
		{
			System.out.print("You have entered even length string");
		}
		else
		{
			System.out.println("You have entered odd length string");
		}
	}

}
