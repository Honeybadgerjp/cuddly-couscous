// Assignment #: 5
// Arizona State University - CSE205
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: TTH 3:00pm-4:15pm
//  Description: This is a Utility class used to create the Customer object.

public class CustomerParser
{
	public static Customer parseStringToCustomer(String lineToParse)
	{
		String s=lineToParse.substring(0,1);
		if(s=="N")
		{
			String type="Non Member";
			Customer v= new NonMemberCustomer(type, type, 0, 0, 0, 0, 0);
			return v;
		}
		else
		{
			String type="Member";
			Customer u= new MemberCustomer(type, type, 0, 0, 0, 0, 0);
			return u;
		}
	}

}
