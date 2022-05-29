// Assignment #: 5
// Arizona State University - CSE205
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: TTH 3:00pm-4:15pm
//  Description: This Class represent the non-member customers who also pay a visit fee to shop at the store.

public class NonMemberCustomer extends Customer
{
	private double visitFee;
	
	public NonMemberCustomer(String fName, String lName, double amount, int year, int month, int date, double fee)
	{
		super(fName, lName, amount, year, month, date);
		visitFee=fee;
	}
	
	public void computePaymentAmount()
	{
		paymentAmount=(purchasedAmount+visitFee);
	}
	
	public String toStirng() // displays all of the non-member customer's transation details.
	{
		String s= "\nNonMember Customer:"+super.toString()+"Visit Fee:\t\t"+visitFee+"\n\n";
		return s;
	}

}
