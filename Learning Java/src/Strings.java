
import java.util.Scanner;
public class Strings
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is your first number: ");
		int x = in.nextInt();
		
		System.out.print("What is your second number: ");
		int y = in.nextInt();
		
		System.out.println("The sum is:       " + (x + y));
		System.out.println("The diffrence is: " + (x - y));
		System.out.println("The product is:   " + x * y);
		System.out.println("The average is:   " + (x + y) / 2);
		System.out.println("The distance is:  " + Math.abs(x - y));
		System.out.println("The maximum is:   " + Math.max(x, y));
		System.out.println("The mimimum is:   " + Math.min(x, y));
		
		
		
		
		
	}


	

	
}
