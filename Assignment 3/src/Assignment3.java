/*
 * Jose Peregrina
 * Assignment3.java
 * This program is a simple banking program where the user can deposit, transfer and withdraw money after 
   creating the Account.
 * Lab L / Jae Shin
 * CSE 110 M-W-F 12:00-12:50 
 * Time Spent: 5 hrs
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment3 
{
	public static void main(String[] args)
	{
		int choice;
		double accountBalance;
		double savings;
		double checking;
		int a;
		int b;
		int c;
		double money;
		String first;
		String second;
		String name;
		int pin = 0;
		double intrest = 1.016;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to CS110 BANK");
		
		System.out.print("What is your name? ");
		first = in.next();
		second = in.next();
		name = (first + " " + second);
		//System.out.print(name);
		
		System.out.print("initial deposit into Savings: ");
		savings = in.nextDouble();
		//System.out.println(savings);
		
		System.out.print("initial deposit into Checking: ");
		checking = in.nextDouble();
		//System.out.println(checking);
		
		System.out.print("Enter your pin: ");
		pin = in.nextInt();
		
		accountBalance = (savings + checking);
		//System.out.print(accountBalance);
		
		if (pin >= 1 & pin <= 4)
		{
			System.out.print(name + "'s Account balance: " + accountBalance	+ " (S: " + savings + ", C: ");
			System.out.println(checking + ")");
			System.out.println("Bank Options: ");
			System.out.println("1. Deposit Money");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Transfer Money");
			System.out.println("4. Quit");
			choice = in.nextInt();
			//System.out.print(choice);
			
			if (choice == 1)
			{
				System.out.println("1. Deposit to Checking ");
				System.out.println("2. Deposit to Savings ");
				System.out.println("3. Cancel ");
				a = in.nextInt();
				
				switch (a)
				{
				case 1:
					System.out.print("Amount to deposit to Checking: ");
					money = in.nextDouble();
					System.out.println("You deposited " + money + " to Checking");
					System.out.print("After this transaction your balance is: ");
					System.out.println(accountBalance + money + " (S: " + savings + ", C: "
							+ (checking + money));
					System.out.println(" ");
					savings = (savings * intrest);
					checking = (checking + money) * intrest;
					System.out.println("We have added interest to your account! (S: "
							+ savings + ", C: " + checking);
					break;
				case 2:
					System.out.print("Amount to deposit to Savings: ");
					money = in.nextDouble();
					System.out.println("You deposited " + money + " to Savings");
					System.out.print("After this transaction your balance is: ");
					System.out.println(accountBalance + money + " (S: " + (savings + money) + ", C: "
							+ checking);
					System.out.println(" ");
					savings = (savings + money) * intrest;
					checking = (checking * intrest);
					System.out.println("We have added interest to your account! (S: "
							+ savings + ", C: " + checking);
					break;
				case 3:
					System.out.println("Deposit Canceled");
					
				}
				
			}
			else if (choice == 2)
			{
				System.out.println("1. Withdraw from Checking ");
				System.out.println("2. Withdraw from Savings ");
				System.out.println("3. Cancel ");
				b = in.nextInt();
				
				switch (b)
				{
				case 1:
					System.out.print("Amount to Withdraw from Checking: ");
					money = in.nextDouble();
					System.out.println("You Withdrew " + money + " from Checking");
					System.out.print("After this transaction your balance is: ");
					System.out.println(accountBalance - money + " (S: " + savings + ", C: "
							+ (checking - money));
					System.out.println(" ");
					savings = (savings * intrest);
					checking = ((checking - money) * intrest);
					System.out.println("We have added interest to your account! (S: "
							+ savings + ", C: " + checking);
					break;
				case 2:
					System.out.print("Amount to Withdraw from Savings: ");
					money = in.nextDouble();
					System.out.println("You Withdrew " + money + " from Savings");
					System.out.print("After this transaction your balance is: ");
					System.out.println(accountBalance - money + " (S: " + (savings - money) + ", C: "
							+ checking);
					System.out.println(" ");
					savings = (savings - money) * intrest;
					checking = (checking * intrest);
					System.out.println("We have added interest to your account! (S: "
							+ savings + ", C: " + checking);
					break;
				case 3:
					System.out.println("Withdraw Canceled");
					
				}
			}
			else if (choice == 3)
			{
				System.out.println("1. Transfer from Checking to Savings ");
				System.out.println("2. Transfer from Savings to Checking ");
				System.out.println("3. Cancel ");
				c = in.nextInt();
				
				switch (c)
				{
				case 1:
					System.out.print("Amount to transfer from Checking to Savings: ");
					money = in.nextDouble();
					System.out.println("You transferred " + money + " from Checking to Savings.");
					System.out.print("After this transaction your balance is: ");
					System.out.println(accountBalance + " (S: " + (savings + money) + ", C: "
							+ (checking - money));
					System.out.println(" ");
					savings = ((savings + money) * intrest);
					checking = ((checking - money) * intrest);
					System.out.printf("We have added interest to your account! (S: "
							+ savings + ", C: " + checking);
					
					break;
				case 2:
					System.out.print("Amount to transfer from Savings to Checking: ");
					money = in.nextDouble();
					System.out.println("You transferred " + money + " from Savings to Checking.");
					System.out.print("After this transaction your balance is: ");
					System.out.println(accountBalance + " (S: " + (savings - money) + ", C: "
							+ (checking + money));
					System.out.println(" ");
					savings = ((savings - money) * intrest);
					checking = ((checking + money) * intrest);
					System.out.printf("We have added interest to your account! (S: "
							+ savings + ", C: " + checking);
					break;
				case 3:
					System.out.println("Transfered Canceled");
				}
			}
		}
		System.out.println("\n Have a Great Day");
	}

}
