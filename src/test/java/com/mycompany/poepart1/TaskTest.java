/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poepart1;

import java.util.ArrayList;
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
        System.out.println("Task successfully captured");
        Task task = new Task("Login Feature", 1, "Create Login to authenticate users", "Robyn Harrison", 8, "To Do");
        assertTrue(task.checkTaskDescription(), "Task successfully captured");
    }
    
    // Test for Invalid Task Description
    @Test
    public void testInvalidTaskDescription() {
        System.out.println("Please enter a task description of less than 50 characters.");
        Task task = new Task("Login Feature", 1, "Create a Login feature that will be tasked to authenticate users.", "Robyn Harrison", 8, "To Do");
        assertFalse(task.checkTaskDescription(), "Please enter a task description of less than 50 characters.");
    }

    // Test for Task ID creation for test Data 1.
   @Test
    public void testCreateTaskID() {
        Task task = new Task("Login Feature", 1, "Create Login to authenticate users", "Robyn Harrison", 8, "To Do");
        assertEquals("LO:1:SON", task.createTaskID());
     
    }

    
    
    
}
