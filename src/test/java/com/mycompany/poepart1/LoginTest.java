/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poepart1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
     private Login loginSystem;  
    
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
    //Test invalid user registration
    @Test
    public void testInvalidUserRegistration() {
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
    
//Test user registration with an valid username & assword
    @Test
    public void testvalidregistration() {
        System.out.println("registerUser");
        String username = "kyl_1";
        String password = "assword1!";
        String name = "Kyle";
        String surname = "Newport";
        Login instance = new Login();
        String result = instance.registerUser(username, password, name, surname);
        String expResult = "Username is not correctly formatted.";
        assertEquals(expResult, result);
    }
    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "";
        String password = "";
        Login instance = new Login();
        Boolean expResult = null;
        Boolean result = instance.loginUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LoginStatus method, of class Login.
     */
    @Test
    public void testLoginStatus() {
        System.out.println("LoginStatus");
        String username = "";
        String password = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.LoginStatus(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUsername method, of class Login.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        String username = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        String name = "";
        String surname = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.registerUser(username, password, name, surname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
