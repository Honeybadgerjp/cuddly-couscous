// Assignment #: 2
// Arizona State University - CSE205
// 		   Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: TTH 3:00PM-4:15PM
/*  Description: This program will accept integers from Scanner
				 And then make calculation and show the result
				 to the standard output. When 0 is read the 
				 program stops reading.
*/
				
import java.util.Scanner;
// Allows the scanner object to be created.

public class Assignment2 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		// Creates the scanner object to read user input.
		
		// Variables for input,even count,sum of negatives and minimum
		int num;
		int min=1000000000;
		int count=0;
		int sum=0;
		
		//keeps the loop running
		while(scan.hasNextInt())
		{	
			//assign next number to num variable
			num=scan.nextInt();
			
			if(num<0)
			{	
				sum+=num;
				// finds even integers and counts them
				if(num%2==0)
				{
					count++;
				}
				if(num<min){//assigns minimum
					min=num;
				}
			}
			if(num>=0)
			{
				// finds even integers and counts them
				if(num%2==0)
				{
					count++;
				}
				if(num<min){//assigns minimum
					min=num;
				}
				if(num==0){
					break;// breaks from loop
				}
			}
		}
		System.out.print("The minimum integer is "+ min
				+"\nThe count of even integers in the sequence is "
				+count +"\nThe sum of negative integers is " + sum);
				// shows the output
	}
}
