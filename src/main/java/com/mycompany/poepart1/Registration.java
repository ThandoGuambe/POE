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
public class Registration {

    public boolean checkUsername(String username) {
        //Temporary variable for checking
        boolean Found;
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
    

    
}
