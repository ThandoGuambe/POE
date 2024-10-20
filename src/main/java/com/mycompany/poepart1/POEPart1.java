/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class POEPart1 {

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
        
       //Prompt user name and surname
       
       System.out.println("Enter First Name: ");
       name = input.next();
       System.out.println("Enter Last Name: ");
       surname = input.next();
       
       System.out.println("______________________");
       //User registration
       System.out.println("Register Account");
       
       System.out.println("Enter Username: ");
       username = input.next();
       
       System.out.println("Enter Password: ");
       password = input.next();
       
       //Register user
       String registration = loginSystem.registerUser(username, password, name, surname);
       System.out.println(registration);
       
       //If registration is successful, proceed to login
       if (registration.equals("User registered successfully!")) {
            // If registration is successful, proceed to login
            System.out.println("______________________");
            System.out.println("Login to your account:");
            System.out.println("Enter username: ");
            loginUsername = input.next();

            System.out.println("Enter password: ");
            loginPassword = input.next();

            // Display login status message
            String loginStatus = loginSystem.LoginStatus(loginUsername, loginPassword, name, surname);
            System.out.println(loginStatus);
            
        //Display welcome message
        if (loginStatus.equals("Welcome " + name + " " + surname + ", it is great to see you again.")){
            System.out.println("Welcome to EasyKanban");
            
            boolean running = true;
            while(running){
                System.out.println("_________________________________________________");
                System.out.println("Choose an option:");
                System.out.println("1) Add tasks");
                System.out.println("2) Show report");
                System.out.println("3) Quit");
                
                int option = input.nextInt();
                
                switch (option){
                    case 1:
                        //Task Creation
                        int numTasks;
                        System.out.println("How many tasks would you like to add?");
                        numTasks = input.nextInt();
                        for(int i = 0; i < numTasks;i++){
                            String taskName;
                            System.out.println("Enter task name");
                            taskName = input.next();
                            
                            String description;
                            System.out.println("Enter task description (max of 50 characters:");
                            description = input.next();
                            
                            String developerName;
                            System.out.println("Enter developer details (First and Last Name):");
                            developerName = input.nextLine();
                            
                            int duration;
                            System.out.println("Enter task duration (in hours):");
                            duration = input.nextInt();
                            
                            System.out.println("Choose task status (1: To Do, 2: Doing, 3: Done):");
                            
                            int statusChoice = input.nextInt();
                            String taskStatus = switch (statusChoice){
                                case 1 -> "To Do";
                                case 2 -> "Doing";
                                case 3 -> "Done";
                                default -> "Unknown";
                            };
                            
                            Task task = new Task(taskName, description, i, developerName, duration, taskStatus);
                            if(task.checkTaskDescription()){
                                JOptionPane.showMessageDialog(null,task.printTaskDetails());
                            }
                        }
                        break;
                    case 2:
                        //Show report - currently in 
                        
                }
            }
            
            
              
        } else {
           input.close();
           System.out.println("__________________END______________________");
            }
        }
    }
}
