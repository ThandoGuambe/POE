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
public class TaskTest {
    
    // Test for Valid Task Description
    @Test
    public void testValidTaskDescription() {
        System.out.println("checkTaskDescription");
        Task task = new Task("Login Feature", 1, "Create Login to authenticate users", "Robyn Harrison", 8, "To Do");
        assertTrue(task.checkTaskDescription(), "Description within 50 characters should be valid.");
    }
    
    // Test for Invalid Task Description
    @Test
    public void testInvalidTaskDescription() {
        System.out.println("checkTaskDescription");
        Task task = new Task("Login Feature", 1, "Create Login to authenticate users", "Robyn Harrison", 8, "To Do");
        assertTrue(task.checkTaskDescription(), "Description within 50 characters should be valid.");
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        Task instance = null;
        String expResult = "";
        String result = instance.createTaskID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        Task instance = null;
        String expResult = "";
        String result = instance.printTaskDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        Task instance = null;
        int expResult = 0;
        int result = instance.returnTotalHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
