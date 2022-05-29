// Assignment #: Exam 2 study
// Arizona State University - CSE205
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: TTH 3:00pm-4:15pm
//  Description: This is an example program for exam 2

import java.util.*;

public class ProductCodes 
{
	public static void main(String[] args)
	{
		String code;
		char zone;
		int district, valid = 0, banned = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter product code (XXX to quit): ");
		code = input.next();
		
		while(!code.equals("XXX"))
		{
			try
			{
				zone = code.charAt(9);
				district = Integer.parseInt(code.substring(3,7));
				valid++;
				if(zone == 'R' && district > 2000)
					banned++;
			}
			catch (StringIndexOutOfBoundsException exception)
			{
				System.out.println("Improper code length: " + code);
			}
			catch (NumberFormatException exception)
			{
				System.out.println("District not nurmerical: " + code);
			}
			System.out.println("Enter product code (XXX to quit): ");
			code = input.next();
		}
	}
	

}
