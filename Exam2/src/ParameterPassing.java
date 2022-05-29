// Assignment #: Exam 2 study
// Arizona State University - CSE205
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: TTH 3:00pm-4:15pm
//  Description: Group of three example for exam2

public class ParameterPassing
{
	public static void main(String[] args)
	{
		ParameterTester tester = new ParameterTester();
		
		int a1 = 111;
		Num a2 = new Num(222);
		Num a3 = new Num(333);
		
		tester.changeValues(a1,a2,a3);
	}
}
