// Assignment #: Exam 2 study
// Arizona State University - CSE205
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: TTH 3:00pm-4:15pm
//  Description: This class divides by zero on purpose to produce an exception

public class DividingByZero
{
	public static void main(String[] args)
	{
		int numerator = 10;
		int denominator = 0;
		System.out.println(numerator/denominator);
		System.out.println("This text will not be printed");
	}

}
