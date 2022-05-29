/*
 * Jose Peregrina
 * Assignment1.java
 * This program is design to test my understanding of java so far by converting a persons height in feet and
   inches to meters
 * Lab L on Thursday from 
 * Time Spent: 57 minutes
 * 9/7/15
 */

/*
 * Question 1
 * str name = myString;
 * int n = str.length();
 * System.out.println(n);
 * 
 * Question 2
 * import java.util.Scanner;
 * Scanner in = new Scanner(System.in);
 * System.out.print("What is your age? ")
 * int age = in.next();
 * 
 * Qestion 3
 * System.out.println(mystery);
 * Hy
 */

import java.util.Scanner;
public class Assignment1 extends Strings
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in); // add the scanner method
		
		int inch_foot = 12; 				// declare my variables
		double inch_centi = 2.54;
		int centi_meter = 100;
		 
		System.out.print("What is your name? "); // users import of name/height
		String name = in.next();
		
		System.out.println("What is your height?");
		
		System.out.print("Feet: ");
		int feet = in.nextInt();
		
		System.out.print("Inches: ");
		int inches = in.nextInt();
		
		double meters = (((feet * inch_foot) + inches) * inch_centi) / centi_meter; // formula for conversion
		
		System.out.print(name +", your height in meters is "); // Visible feedback
		System.out.printf("%.2f", meters);
		
	}

}
