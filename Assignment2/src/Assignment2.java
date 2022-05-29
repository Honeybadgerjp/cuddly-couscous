/*
 * Jose Peregrina
 * Assignment2.java
 * This program
 * Lab L
 * Time spent
 * 9/14/15
 * 
 */

/*
 * Question 1
 * System.out.println(myString.lenght());
 * 
 * Question 2 
 * System.out.println(myString.charAt(16));
 * 
 * Question 4
 * System.out.println(myString.toUpperCase());
 * 
 * Question 5
 * System.out.println(myString.substring(24, 38));
 */

import java.util.Scanner;

public class Assignment2
{

	public static void main(String[] args)
	{

		double mTicket = 5.00;
		double nTicket = 7.50;
		double rTicket = 3.50;
		int types = 3;
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to the Movie Theatre!");
		System.out.println("--------------------------------");
		System.out.println("the cost of the movie tickets: ");
		System.out.println("Matinee:        $5.00");
		System.out.println("Normal:         $7.50");
		System.out.println("Rush Hour:      $3.50");
		
		System.out.print("Hou many Matinee tickets would you like to buy: ");
		int matinee = in.nextInt();
		
		System.out.print("how many Normal tickets would you like to buy: ");
		int normal = in.nextInt();
		
		System.out.print("how many Rush Hour tickets would you like to buy: ");
		int rush = in.nextInt();
		
		double totalMatinee = matinee * mTicket;
		double totalNormal = normal * nTicket;
		double totalRush = rush * rTicket;
		int totalTickets = (int) (mTicket + nTicket + rTicket);
		double average = totalTickets/types;
		
		
		System.out.println("The total cost for Matinee tickets is: " + totalMatinee);
		System.out.println("The total cost for Normal tickets is: " + totalNormal);
		System.out.println("The total cost for Rush Hour tickets is: " + totalRush);
		System.out.println("The total cost is: " + (totalMatinee + totalNormal + totalRush));
		System.out.println("The total number of tickets is: " + (matinee + normal + rush));
		System.out.println("The average cost of per ticket is: " + average);
		

	}

}
