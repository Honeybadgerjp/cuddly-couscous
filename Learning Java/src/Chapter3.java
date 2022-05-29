import java.util.Scanner;

public class Chapter3 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double product;
		double discountRate;
		double discountedPrice;
			
		System.out.print("What is the price of the product? ");
		product = in.nextDouble();
			
		if (product < 128)
		{
			discountRate = .92;
		}
		else
		{
			discountRate = .84;
		}
			
		discountedPrice = discountRate * product;
		
		System.out.println("The discounted Price is: " + discountedPrice);
	}	
}
