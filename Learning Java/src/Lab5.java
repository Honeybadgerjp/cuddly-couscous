/*
 * Jose Peregrina
 * Lab5.java
 * This program creates a class that That will be used to calculate perimeter area and diameter of a circle 
   based on user input.
 * For: CSE 110- Lab#5
 * Time Spent: 40 min
 */
 
import java.util.Scanner;
import java.text.DecimalFormat;

class Circle 
	{  
	private double radius;
	public final double PI=3.14;
	public Circle()
	{  
		radius = 1;
		// called one time
 	}
	public void setValue(double value)
	{
		radius = value;
	}
	public double diameter() 
	{
		return radius * 2;
	}
	public double perimeter() 
	{
		 return radius * 2 * PI;
	}
	public double area() 
	{
		 return radius * PI * radius;
	}
}
public class Lab5 
{ 
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Circle circ = new Circle();
		DecimalFormat fmt = new DecimalFormat("0.000");
		
		System.out.println("Enter the radius of the circle ");
		double r = in.nextDouble();
		circ.setValue(r);
		
		double result;
		result = circ.diameter();
		System.out.println("The Diameter of the circle is " + fmt.format(result));

		result = circ.perimeter();
		System.out.println("The Perimeter of the circle is " + fmt.format(result));

		result = circ.area();
		System.out.println("The Area of the circle is " + fmt.format(result));
		
		
		
				
	}

}