/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author RC_Student_lab
 */
public class POEPart1 {
    
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static int totalTaskDuration = 0;
        
    public static void main(String[] args) {
              
        //Object for a Scanner
        Scanner input = new Scanner(System.in);
        
       //Instance of a login class
       Login loginSystem = new Login();
        
        //Declarations
        String username;
        String password;
        String name;
        String surname;
        
        String loginUsername;
        String loginPassword;
        boolean LoggedIn = false;
        
       //Prompt user name and surname
       
       name = JOptionPane.showInputDialog("Enter First Name: ");
       surname = JOptionPane.showInputDialog("Enter Last Name: ");
       
              //User registration
        username = JOptionPane.showInputDialog("Register Account\nEnter Username: ");
       
        password = JOptionPane.showInputDialog("Enter Password: ");
       
       //Register user
       String registration = loginSystem.registerUser(username, password, name, surname);
       JOptionPane.showMessageDialog(null, registration);
       
       //If registration is successful, proceed to login
       if (registration.equals("User registered successfully!")) {
            // If registration is successful, proceed to login
            loginUsername = JOptionPane.showInputDialog("Login to your account\nEnter username: ");
            loginPassword = JOptionPane.showInputDialog("Enter password: ");

            // Display login status message
            String loginStatus = loginSystem.LoginStatus(loginUsername, loginPassword, name, surname);
           JOptionPane.showMessageDialog(null, loginStatus);
        
          
          
        if (loginStatus.equals("Welcome " + name + " " + surname + ", it is great to see you again.")){
           LoggedIn = true;
                }
       }
        
            if(LoggedIn){
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
            
            boolean running = true;
            while(running){
                String option = JOptionPane.showInputDialog(
                    "Please select an option:\n" +
                    "1) Add Tasks\n" +
                    "2) Show Report (Coming Soon)\n" +
                    "3) Quit");

                              
                switch (option){
                    case "1":
                        //Task Creation
                        addTasks();
                        break;
                    case "2":
                        // Show report - currently in development
                        JOptionPane.showMessageDialog(null, "Coming Soon");
                        break;
                    case "3":
                        // Quit Application
                        running = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid option. Try again.");
                    }
                }         
        }
        input.close();
        JOptionPane.showMessageDialog(null, "__________________END______________________");
            }
    
    private static void addTasks(){
        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks would you like to add?"));
        ArrayList<Task> taskList = new ArrayList<>();
        int totalHrs = 0;

        for (int i = 0; i < numTasks; i++) {
            String taskName = JOptionPane.showInputDialog("Enter Task Name:");
            String description;
            do {
                description = JOptionPane.showInputDialog("Enter Task Description (max 50 characters):");
                if (description.length() > 50) {
                    JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
                } else {
                    JOptionPane.showMessageDialog(null, "Task successfully captured");
                }
            } while (description.length() > 50);

            String developerDetails = JOptionPane.showInputDialog("Enter Developer Name:");
            int duration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration (in hours):"));

            // Task status menu
            String[] statusOptions = {"To Do", "Done", "Doing"};
            String taskStatus = (String) JOptionPane.showInputDialog(null, "Select Task Status",
                    "Task Status", JOptionPane.QUESTION_MESSAGE, null, statusOptions, statusOptions[0]);
           //Create task object
            Task task = new Task(taskName,i, description, developerDetails,duration, taskStatus);
            taskList.add(task);
            totalHrs += duration;
            
            // Display task details
            JOptionPane.showMessageDialog(null, task.printTaskDetails());
        }
         // Display total hours
        JOptionPane.showMessageDialog(null, "Total task hours: " + totalHrs);
    }
}


