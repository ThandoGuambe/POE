/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1;
import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
class Login {
    public boolean checkUsername(String username) {
        //Declare temporary variable for checking
        boolean UserFound = false;
        //Check username
        if (username.contains("_") && username.length() <=5){
        //Assign temporary variable for checking
            UserFound = true;
            //Message
            System.out.println("Username is successfully captured.");
        }else{
        //Re-assign temporary variable for checking
            UserFound = false;
            System.out.println("Username is not formatted, please ensure that "
                    + "your usernamecontains an underscore and is no more "
                    + "than 5 characters in length.");
        }
        return username.contains("_") && username.length() <=5;
    }
    public boolean checkPasswordComplexity(String password){
        
        //Check password
        Pattern check_num = Pattern.compile("[0123456789]");
        Pattern check_specials = Pattern.compile("[!@#$%^&*+-_:.<,>~']");
        Pattern check_Uppercase = Pattern.compile("[QWERTYUIOPLKJHGFDSAZXCVBNM]");
        
        boolean PasswordFound = false;
        //Check all
        if(check_num.matcher(password).find() && check_specials.matcher(password).find() && check_Uppercase.matcher(password).find()){
            PasswordFound =true;
            //message
            System.out.println("Password is successfully captured.");
        }else{
            PasswordFound =false;
            System.out.println("Password is not formatted, please ensure that "
                    + "the password contains at least 8 characters, a capital letter "
                    + "a number and a special character.");
        }
        return check_num.matcher(password).find() && check_specials.matcher(password).find() && check_Uppercase.matcher(password).find();
    } 
    public String registerUser(String username,String password, String name, String surname) {
        //check if username is valid
        if(!checkUsername(username)){
            return "The username is not correctly formatted";
        }
        if(!checkPasswordComplexity(password)){
            return "The password does not meet the complexity requirements.";
        }else{
            return "User succesfully registered.";
        }
        
    } 
}
