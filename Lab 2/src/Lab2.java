/*
 * AUTHOR: JOSE PEREGRINA
 * FILENAME: Lab2.java
 * SPECIFICATION: This program is for practicing the use of primitive data types, expressions.
 * FOR:CSE 110- Lab #2-L
 * TIME SPENT: 10:30 - 
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab2
{
	public static void main(String[] args)
	{
			// formats number to have two digits after an decimal
		DecimalFormat fmt= new DecimalFormat("0.##");
		
        	// Defines a variable scan of the type Scanner
        Scanner scan= new Scanner(System.in);
		
        	// declare some variables of different types
        double decimalNum;
        String userName;
        String courseNum;
        
        	// Prompt the user to enter his first name and save it as userName
        System.out.print("Please enter your first name and last name:");
        userName= scan.nextLine();
        
        	// Prompt the user to enter the course number like (MATH200) and save as courseNum
        System.out.print("Please enter your Course(like MATH200): ");
        courseNum= scan.next();
        
        	// Prompt the user to enter any decimal number with 5 digits after and save as decimalNum
        System.out.print("Please enter a number with 5 digits after + decimal(like 45.4367): ");
        decimalNum = scan.nextDouble();
        
        	// Print the user name as "User's name is: " <userName>
        System.out.println("User's name is: " + userName);
        
        	// Print the course number as "The Course number is: " <courseNum>
        System.out.println("The Course number is: " + courseNum);
        
        	// print the decimal number <decimalNum> with only 2 digits after
        	// the decimal by calling the format() method
        System.out.println("The formatted decimal number is: " + fmt.format(decimalNum));
        	
        	// length of name
        System.out.println("Length of name \t\t" + (userName.length()-1)); 
        
        	// covert name to uppercase
        System.out.println("Case conversions \t\t"+ userName.toUpperCase()); 
        
        	// prints first letter of name
        System.out.println("Character at position 1 \t" + userName.charAt(0));
        
        	// prints first three letter of name
        System.out.println("Substring from user name \t" + userName.substring(0,3)); 
        
        	// compares course name with user name
        System.out.println("Equality using compare to \t" + userName.compareTo(courseNum));
        
        	// tries to equal values of names
        System.out.println("Equality using equals \t\t" + userName.equals(courseNum));
        
        	// tries to equal values without case sensitive
        System.out.println("Equality ignoring case \t\t" + userName.equalsIgnoreCase(courseNum));


	}
}
