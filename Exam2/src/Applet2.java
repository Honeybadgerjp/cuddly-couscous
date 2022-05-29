// Assignment #: Exam 2 study
// Arizona State University - CSE205
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: TTH 3:00pm-4:15pm
//  Description: the example for applet for exam2

import javax.swing.*;

public class Applet2 extends JApplet
{
	public void init()
	{
		//button
		JButton button1 = new JButton("Button1");
		
		//button to content pane to applet
		getContentPane().add(button1);
		
		setSize(300,100);
	}

}
