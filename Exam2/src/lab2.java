// Assignment #: Exam 2 study
// Arizona State University - CSE205
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: TTH 3:00pm-4:15pm
//  Description: read keyboard continously without scanner

import java.io.*;

public class lab2 
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String line = br.readLine();
		while(line.equals("QUIT") == false)
		{
			System.out.println(line);
			line = br.readLine();
		}
	}

}
