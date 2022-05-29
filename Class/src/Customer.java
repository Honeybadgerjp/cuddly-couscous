// Assignment #: 5
// Arizona State University - CSE205
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: TTH 3:00pm-4:15pm
//  Description: An abstract class where the basic attributes of every customer is represented.

public abstract class Customer 
{
	protected String firstName;
	protected String lastName;
	protected double purchasedAmount;
	protected int purchasedYear;
	protected int purchasedMonth;
	protected int purchasedDate;
	protected double paymentAmount;
	
	public Customer(String fName, String lName, double amount, int year, int month, int date)
	{
		firstName=fName;
		lastName=lName;
		purchasedAmount=amount;
		purchasedYear=year;
		purchasedMonth=month;
		purchasedDate=date;
		paymentAmount=0.0;
	}
	
	public double getPurchasedAmount()
	{
		return purchasedAmount;
	}
	
	public abstract void computePaymentAmount()
	{
		
	}
	
	public String toString() // displays all the information of the transaction.
	{
		String s="\nFirst name:\t\t"+firstName+"\nLast name:\t\t"+lastName+"\nPurchased Amount:\t\t"+purchasedAmount+"\nPurchased Date:\t\t"
				+purchasedMonth+"/"+purchasedDate+"/"+purchasedYear+"\nPayment Amount:\t\t"+ paymentAmount+"\n";
		return s;
	}
}
