/*
 * Jose Peregrina
 * Lab4.java
 * This progam 
 * CSE-Lab #4
 * Time Spent: 50 min
 */

import java.util.Scanner;

public class Lab4
{
	public static void main(String[] args)
	{
		int choice; // 1,2,3 choices
		Scanner in = new Scanner(System.in);//user input
		int i;
		do
		{
			System.out.println("Enter you choice: ");
			System.out.println("1) sum, 2) factorial, 3) quit");
			choice = in.nextInt();//choice now has value
			switch(choice)
			{
			case 1:
				int m, sum = 0;// m contains a value
				System.out.println("Enter the number");
				m = in.nextInt();//contains the max
				for (i = 1; i<= m; i++)
				{
					//System.out.println("1=" + i +",sum=" + sum);
					sum = sum + i;
				}
				System.out.println("The sum of the first " + m +" numbers is " + sum);
			break;
			case 2:
				int n, fact = 1;// m contains a value
				System.out.println("Enter the number");
				n = in.nextInt();//contains the max
				for (i = 1; i<= n; i++)
				{
					//System.out.println("1=" + i +",fact=" + fact);
					fact = fact * i;
				}
				System.out.println("The factorial of " + n + " is " + fact);
			break;
			default:
			break;
			}
		}
		while(choice < 3);
	}

}
