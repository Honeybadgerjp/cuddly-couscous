// Assignment #: 12
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: TTH 3:00-4:15pm
//  Description: Defines the panel where the beams our moving.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BeamsPanel extends JPanel
{
	private Color color;
	private Timer timer;
	private int delay;
	private int step;
	private int centerX;
	private int centerY;
	private int diameter;
	private int diameterLimit;
	private int beamNum;
	private int angleSize;
	
	public BeamsPanel(Color color, int width)
	{
		color = this.color;
		delay = 20;
		step = 3;
		setBackground(Color.BLACK);
		centerX = width/2;
		centerY = width/2;
		diameterLimit = (width-10)/2;
		diameter = 0;
		beamNum = 8;
		angleSize = 360/(beamNum*2);
		timer = delay + mouse;
	}

	public void resume()
	{
		public void start()
	}
	
	public void suspend()
	{
		
	}
	
	public void changeColor(Color anotherColor)
	{
		
	}
	
	public void setDelay(int delayValue)
	{
		
	}
	
	public void paintComponet(Graphics page)
	{
		
	}
	
	private class MoveListener implements ActionListener
	{
		
	}
	
}
