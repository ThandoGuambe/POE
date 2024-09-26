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
        //Temporary variable for checking
        boolean Found = false;
        //Check username
        if (username.contains("_") && username.length() <5){
            Found = true;
            //Message
            System.out.println("Username is successfully captured");
        }else{
            Found= false;
            System.out.println("Username is not formatted, please ensure that "
                    + "your usernamecontains an underscore and is no more "
                    + "than 5 characters in length.");
        }
        return Found;
    }
    public boolean checkPassword(String password){
        
        //Check password
        Pattern check_num = Pattern.compile("[0123456789]");
        Pattern check_specials = Pattern.compile("[!@#$%^&*+-_:.<,>~']");
        Pattern check_Uppercase = Pattern.compile("[QWERTYUIOPLKJHGFDSAZXCVBNM]");
        
        boolean Found = false;
        //Check all
        if(check_num.matcher(password).find() && check_specials.matcher(password).find() && check_Uppercase.matcher(password).find()){
            Found =true;
            //Message
            System.out.println("Password successfully captured");
        }else{
            System.out.println("Password is not correctly formatted, please "
                    + "ensure that the password containsat least 8 characters,"
                    + "a capital letter, a number and a special character.");
        }
        return Found;
    } 
}
