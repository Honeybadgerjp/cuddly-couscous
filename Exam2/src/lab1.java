// Assignment #: Exam 2 study
// Arizona State University - CSE205
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: TTH 3:00pm-4:15pm
//  Description: read keyboard continously with scanner

import java.util.*;

public class lab1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String line = in.next();
		while(line.equals("QUIT") == false)
		{
			System.out.println(line);
			line = in.next();
		}
	}
	

}
