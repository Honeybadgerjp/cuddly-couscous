import java.util.Scanner;
public class TwoNumbers 
{
	public static void main(String[] args)
	{	
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the first lenght: ");
		int lengta = in.nextInt();
		
		System.out.print("What is the second lenght: ");
		int lengthb = in.nextInt();
		
		System.out.println("the Parimeter of the retagle is: " + (lengta + lengta) + (lengthb + lengthb));
		System.out.println("the diagnlo of the retagle is:   " +  Math.sqrt(lengta * lengta + lengthb * lengthb));
		
		
	}
}
