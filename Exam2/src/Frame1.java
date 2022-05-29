// Assignment #: Exam 2 study
// Arizona State University - CSE205
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: TTH 3:00pm-4:15pm
//  Description: example of frame for exam 2

import javax.swing.*;// JFrame and JButton
import java.awt.*;

public class Frame1 
{
	public static void main(String[] args)
	{
		//JFrame obj
		JFrame frame = new JFrame("Testing Frame");
		
		// close operation.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//button
		JButton button1 = new JButton("Button 1");
		
		//add button to content pane on JFrame obj
		Container content = frame.getContentPane();
		content.add(button1);
		
		frame.setSize(200, 100);
		frame.setVisible(true);
		// JFrame obj is now visible
	}

}
