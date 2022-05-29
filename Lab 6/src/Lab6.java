/*
 * Name: Jose Peregrina
 * Title: Lab6.java
 * Description: This program is design to gain practice with loops
 * For: CSE 110-Lab#6
 * Time Spent: 1hr 3min
 */

import java.util.Scanner; 
public class Lab6
{
	public static void main(String[] args)
			{
				// new varibles and methods
				int x;
				int y;
				Scanner scan = new Scanner(System.in);
				
				// display task and save input
				System.out.println("Enter two Integer ");
				x = scan.nextInt();
				y = scan.nextInt();
				int tempx = x;
				int tempy = y;
				
				// run loop to find GCD
				while((x!=0)&& (y!=0)) 
				{
						System.out.print("gcd(" +x+ "," +y + ")=");
						if(x>y)
						{
							System.out.print("gcd(" + x +"-"+ y +","+ y+ ")=");
							x= x - y;
						}
						else
						{
							System.out.print("gcd(" +x +"," +y + "-"+ x +")=");
							y= y - x;
						}
						System.out.println("gcd("+x +","+ y+")");
				}
				if (y==0)
				{
					System.out.println("gcd("+x+","+y+")="+x);
					System.out.println("gcd("+tempx+","+tempy+")="+x);
				}
				else 
				{
					System.out.println("gcd("+x+","+y+")="+y);
					System.out.println("gcd("+tempx+","+tempy+")="+y);
				}
			}
	}
