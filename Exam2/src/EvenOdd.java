// Assignment #: Exam 2 study
// Arizona State University - CSE205
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: TTH 3:00pm-4:15pm
//  Description: example of JOptionPane for exam2 (Determins if the imput is even or odd)

import javax.swing.*;

public class EvenOdd
{
	public static void main(String[] args)
	{
		String numStr, result;
		int num, again;
		
		do
		{
			numStr = JOptionPane.showInputDialog("Enter an integer; ");
			num = Integer.parseInt(numStr);
			result = "That number is " + ((num % 2 == 0) ? "even" : "Odd");
			JOptionPane.showMessageDialog(null, result);
			again = JOptionPane.showConfirmDialog(null, "Do another?");
		}
		while (again == JOptionPane.YES_OPTION);
	}

}
