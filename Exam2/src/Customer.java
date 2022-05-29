// Assignment #: Exam 2 study
// Arizona State University - CSE205
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: TTH 3:00pm-4:15pm
//  Description: customer class for diffrent class example in recap 2 slide

public class Customer 
{
	private int custId;
	private double balance;
	
	public Customer()
	{
		custId = 0;
		balance = 0.0;
	}
	
	public Customer(int id, double balance)
	{
		custId = id;
		this.balance = balance;
	}
	
	public void setCustId(int id)
	{
		custId = id;
	}
	
	public int getCustId()
	{
		return custId;
	}
	
	public void setBalance(double balance2)
	{
		balance = balance2;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		String result = "CustomerId: " + custId + "\nBanlace: " + balance;
		return result;
	}
}
