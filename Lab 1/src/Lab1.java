/*
 * Jose Perergrina
 * Lab1.java
 * This program will show the average of three test scores that the user provides and display
  the answer.
 * CSE 110 
 * Lab L
 * 10:30 - 11:05
 */
import java.util.Scanner;

public class Lab1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);// gives input option for user
		
		final int TESTS = 3;// declares the total tests
		
		int test1 = 0;// declares values
		int test2 = 0;
		int test3 = 0;
		
		System.out.print("Enter the score of the first test:");// prompt
		test1 = in.nextInt();// read in the new value
		
		System.out.print("Enter the score of the second test:");
		test2 = in.nextInt();
		
		System.out.print("Enter the score of the third test:");
		test3 = in.nextInt();
		
				
		double average = (test1 + test2 + test3) / (double)TESTS;// calculates average
		
		System.out.println("Your average test score is:"+ average);// shows the average
		
	}
}
