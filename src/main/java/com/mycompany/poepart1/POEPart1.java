/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;
import java.util.*;

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
       
       //Instance of a Task Class
       Task tasksystem = new Task();
        
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
        }else{
           input.close();
           System.out.println("__________________END______________________");
       }
    }
}
