// Assignment #: Exam 2 study
// Arizona State University - CSE205
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: TTH 3:00pm-4:15pm
//  Description: comparable example

// represents a person
public class Person implements Comparable
{
	private String firstName, lastName, phone;
	
	// Set up this person with specified information
	public Person (String first, String last, String telephone)
	{
		firstName = first;
		lastName = last;
		phone = telephone;
	}
	// Uses both last and first names to determine lexical ordering
	public int compareTo(Object other)
	{
		int result;
		
		if(lastName.equals(((Person)other).lastName))
			result = firstName.compareTo(((Person)other).firstName);
		else
			result = lastName.compareTo(((Person)other).lastName);
		return result;
	}
}
