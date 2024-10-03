/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poepart1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
     
    /**
     * Test of checkUsername method, of class Login.
     */
    //Test valid username
    @Test
    public void testvalidUsername() {
        System.out.println("checkUsername");
        String username = "kyl_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
    }
    //Test invalid username
    @Test
    public void testInvalidUsername() {
        System.out.println("checkUsername");
        String username = "kyle!!!!!!!";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    //Test valid Password
    @Test
    public void testValidPassword() {
        System.out.println("checkPasswordComplexity");
        String password = "Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
    }
//Test Invalid Password
    @Test
    public void testInvalidPassword() {
        System.out.println("checkPasswordComplexity");
        String password = "password";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
    }
    /**
     * Test of registerUser method, of class Login.
     */
    //Test user registration: invalid username
    @Test
    public void testRegisterUser_InvalidUsername() {
        System.out.println("registerUser");
        String username = "kyle!!!!!!!";
        String password = "password";
        String name = "Kyle";
        String surname = "Newport";
        Login instance = new Login();
        String expResult = "Username is not correctly formatted.";
        String result = instance.registerUser(username, password, name, surname);
        assertEquals(expResult, result);
    }
    
    //Test user registration: invalid password
    @Test
    public void testRegisterUser_InvalidPassword() {
        System.out.println("registerUser");
        Login instance = new Login();
        String result = instance.registerUser("user_", "password", "Kyle", "Newport");
        assertEquals("Password is not correctly formatted.", result);
    }
    //Test user registration: valid username and password
    @Test
    public void testRegisterUser_ValidUsernameAndPassword() {
        System.out.println("registerUser");
        Login instance = new Login();
        String result = instance.registerUser("user_", "Password1!", "Kyle", "Newport");
        assertEquals("User registered successfully!", result);
    }  
    /*
     * Test of LoginStatus method, of class Login.
     */
    //Test valid login status
    @Test
    public void testSuccessLoginStatus() {
        System.out.println("LoginStatus");
        Login instance = new Login();
        String username = "user_";
        String password = "Password1!";
        String name = "Kyle";
        String surname = "Newport";
        String expResult = "Welcome " + name + " " + surname + ", it is great to see you again.";
        String result = instance.LoginStatus(username, password, name, surname);
        assertEquals(expResult, result);
    }
}

