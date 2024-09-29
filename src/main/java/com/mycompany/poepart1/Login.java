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
    private POEPart1 registeredUser;
    
    public boolean checkUsername(String username) {
        return username.contains("_") && username.length() <=5;
        }

    public boolean checkPasswordComplexity(String password){
     //Check password
     String pattern = "[A-Z][0-9][!@#$%^&*+-_:.<,>~']";
     return password.matches(pattern);
    }
                 
    public String registerUser(String username,String password, String name, String surname) {
        //check if username is valid
        if(!checkUsername(username)){
            return "The username is not correctly formatted";
        }
        if(!checkPasswordComplexity(password)){
            return "The password does not meet the complexity requirements.";
        }
          registeredUser = new POEPart1();
            return "Username successfully captured.\nPassword successfully captured.";
        }
        
    } 

