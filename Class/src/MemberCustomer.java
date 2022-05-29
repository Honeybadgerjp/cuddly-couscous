// Assignment #: 5
// Arizona State University - CSE205
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: TTH 3:00pm-4:15pm
//  Description: This Class represent the member customers.

public class MemberCustomer extends Customer
{
	private int pointsCollected;
	
	public MemberCustomer(String fName, String lName, double amount, int year, int month, int date, int points)
	{
		super(fName, lName, amount, year, month, date);
		pointsCollected=points;
	}
	
	public void computePaymentAmount() // computes total and adds points.
	{
		if(pointsCollected>=100) // gives 20% discount.
		{
			paymentAmount=(purchasedAmount*.08);
			pointsCollected+=(purchasedAmount*.01);
		}
		else // gives 10% discount.
		{
			paymentAmount=(purchasedAmount*.09);
			pointsCollected+=(purchasedAmount*.01);
		}
	}
	
	public String toString() // displays all of Members' transactions details.
	{
		String s1= "\nMember Customer:\n"+ super.toString()+"Collected Points:\t"+pointsCollected+"\n\n";
		return s1;
	}

}
