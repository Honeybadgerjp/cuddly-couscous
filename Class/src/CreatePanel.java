// Assignment #: 6
//         Name: Jose Peregrina
//    StudentID: 1209120467
//      Lecture: CSE 205 TTh 3:00-4:15pm
//  Description: This class is all that represent the main UI

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class CreatePanel extends JPanel
 {
   private Vector projectList;
   private JButton button1;
   private ProjectSpendingPanel spendingPanel;

 //Constructor initializes components and organize them using certain layouts
 public CreatePanel(Vector projectList, ProjectSpendingPanel spendingPanel)
  {
    this.projectList = projectList;
    this.spendingPanel = spendingPanel;

    //organize components here

    button1 = new JButton("Create a project");
    add(button1);
  }


  //ButtonListener is a listener class that listens to
  //see if the buttont "Create a project" is pushed.
  //When the event occurs, it adds a project information from
  //the text fields to the text area. It also creates a Project object
  //using theinformation and add it to the projectList.
  //It also does error checking.
  private class ButtonListener implements ActionListener
   {
    public void actionPerformed(ActionEvent event)
     {
       // if there is no error, add a project to project list
       // otherwise, show an error message

     } //end of actionPerformed method
  } //end of ButtonListener class

} //end of CreatePanel class