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
        //Login Instance
        Login register_login = new Login();
        
        //Object for a Scanner
        Scanner input = new Scanner(System.in);
        
        //Declarations
        String username;
        String password;
        String name;
        String surname;
        
       //Prompt user for username, password, name and surname
       System.out.println("Register Account");
       System.out.println("______________________");
       
       System.out.println("Enter Username: ");
       username = input.next();
       register_login.checkUsername(username);
       
       System.out.println("Enter Password: ");
       password = input.next();
       register_login.checkPasswordComplexity(password);
       
       System.out.println("Enter First Name: ");
       name = input.next();
       System.out.println("Enter Last Name: ");
       surname = input.next();
       
       
       
       register_login.registerUser(username, password, name, surname);
      
      
      
      
       
    }
}
