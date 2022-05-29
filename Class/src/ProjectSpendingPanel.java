// Assignment #: 6
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: CSE 205 TTh 3:00-4:15pm
//  Description: This class is all that represent the Project Spending tab

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class ProjectSpendingPanel extends JPanel
 {
     private Vector projectList;
     private JList list;
     private Object obj1;
     private String text;


   //Constructor initialize each component and arrange them using
   //certain layouts
   public ProjectSpendingPanel(Vector projectList)
     {
         this.projectList = projectList;
         JList list = new JList(this.projectList);
         
         JTextField spend = new JTextField();
         text=spend.getText();
         // create a Jtextfield
         
         JButton add = new JButton("Add Spending");
         // create a button
         
         JScrollPane scroll = new JScrollPane(list);
         // add a scroll pane
         
         JLabel a= new JLabel("Choose a project to specify some spending:");
         JLabel b= new JLabel("Specify you amount to spend:");
         
         JPanel panel1= new JPanel();
         panel1.setLayout(new GridLayout(2,1));
         panel1.add(a);
         panel1.add(list);
         
         JPanel panel2= new JPanel();
         panel2.setLayout(new GridLayout(2,1));
         panel2.add(b);
         panel2.add(spend);
         
         JPanel panel3 = new JPanel();
         panel3.setLayout(new BorderLayout());
         panel3.add(panel1, BorderLayout.NORTH);
         panel3.add(panel2, BorderLayout.CENTER);
         panel3.add(add, BorderLayout.EAST);
         
         list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         obj1 = list.getSelectedValue();
     }

 //This method  refreshes the JList with
 //updated vector information
 public void updateProjectList()
  {
	 list.updateUI();
      //call updateUI() for the JList object
  }

 //ButtonListener class listens to see the button "Add Spending" is pushed.
 //A user can choose which project to add spending, and that will update the
 //spending and current balance of such project.
 private class ButtonListener implements ActionListener
  {
       public void actionPerformed(ActionEvent event)
        {
    	   int money=Integer.parseInt(text);
    	   
          //get some additional spending from the textfield,
          //update the spending and current balance
          //for the chosen project in the JList.
        }
  } //end of ButtonListener class

} //end of ProjectSpendingPanel class