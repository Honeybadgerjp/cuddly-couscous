// Assignment #: 6
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: CSE 205 TTh 3:00-4:15pm
//  Description: The class Project represents a project .

public class Project
 {
   private String projName;
   private int projNumber;
   private String projLocation;
   private Budget projBudget;

   //Constructor to initialize all member variables
   public Project(double funding)
    {
      projName = "?";
      projNumber = 0;
      projLocation = "?";
      projBudget = new Budget(funding);
    }

   //Accessor methods
   public String getName()
    {
      return projName;
    }

   public int getNumber()
    {
      return projNumber;
    }

   public String getLocation()
    {
	   return projLocation;
	}

   public Budget getBudget()
    {
      return projBudget;
    }

   //Mutator methods
   public void setName(String aName)
    {
     projName = aName;
    }

   public void setNumber(int aNumber)
    {
     projNumber = aNumber;
    }

   public void setLocation(String aLocation)
    {
      projLocation = aLocation;
    }


   //Add a new expenditure to the budget
   public boolean addExpenditure(double amount)
    {
     boolean success = projBudget.addSpending(amount);
     return success;
    }

   //toString() method returns a string containg its name, number, location and budget
   public String toString()
    {
      String result = "\nProject Name:\t\t" + projName
                    + "\nProject Number:\t" + projNumber
                    + "\nProject Location:\t" + projLocation
                    + "\n"
                    + projBudget.toString() + "\n\n";
      return result;
     }
  }

