/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1;
import java.util.regex.Pattern;
import java.util.regex.*;

/**
 *
 * @author RC_Student_lab
 */
class Login {
    //Declaration
    private String name;
    private String surname;
    private String username;
    private String password;
    
    //Checking username validity
    public boolean checkUsername(String username) {
        boolean Found = false;
        if(username.contains("_") && username.length() <=5){
        Found = true;
        System.out.println("Username successfully captured.");
        return true;
        }else{
            Found = false;
            System.out.println("Username is not correctly formatted, "
                    + "please ensure that your username contains an underscore "
                    + "and is no more than 5 characters in length.");
            return false;
        }
    }
    //Checking password complexity
    public boolean checkPasswordComplexity(String password){
     //Pattern regex
     Pattern check_num = Pattern.compile("[0123456789]");
     Pattern check_uppercase = Pattern.compile("[QWERTYUIOPLKJHGFDSAZXCVBNM]");
     Pattern check_specials = Pattern.compile("[!@#$%^&*+-_:.<,>~']");
     
     boolean Found = false;
     //Check all 
     if(check_num.matcher(password).find() && (check_specials.matcher(password).find()) && (check_uppercase.matcher(password).find())){
         Found = true;
         System.out.println("Password successfully captured.");
         return true;
     }else{
         Found = false;
         System.out.println("Password is not correctly formatted, please "
                 + "ensure that the password contains at least 8 characters, a "
                 + "capital letter, a number and a special character.");
         return false;
     }
    }
    //Register the user
    public String registerUser(String username,String password, String name,String surname) {
        this.name = name;
        this.surname = surname;
        //check if username is valid
        if(!checkUsername(username)){
            return "Username is not correctly formatted.";
        } else if(!checkPasswordComplexity(password)){
            return "Password is not correctly formatted.";
        } else{
            this.username = username;
            this.password = password;
            return "User registered successfully!";
        }  
     }
        // Verify login details
        public Boolean loginUser(String username, String password) {
        // Check if the entered username and password match the stored ones
        return this.username.equals(username) && this.password.equals(password);
        }
        //Return login status
        public String LoginStatus(String username, String password) {
        if (loginUser(username, password)) {
            return "Welcome " + name + " " + surname + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}      
   

