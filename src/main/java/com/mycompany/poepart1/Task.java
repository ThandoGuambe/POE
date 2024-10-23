/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
class Task {
    //Declarations
    private String taskName;
    private int taskNum;
    private String description;
    private String developerDetails;
    private int duration;
    private String taskStatus;
    private String taskID;

    // Constructor
    public Task(String taskName, int taskNum, String description, String developerDetails, int duration, String taskStatus) {
        this.taskName = taskName;
        this.taskNum = taskNum;
        this.description = description;
        this.developerDetails = developerDetails;
        this.duration = duration;
        this.taskStatus = taskStatus;
        this.taskID = createTaskID();
    }

    // Check if the task description is valid.
    public boolean checkTaskDescription() {
        return this.description.length() <= 50;
    }

    // Create Task ID.
    public String createTaskID() {
        String taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNum + ":" +
                developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        return taskID;
    }

    // Print task details.
    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n" +
                "Developer Details: " + developerDetails + "\n" +
                "Task Number: " + taskNum + "\n" +
                "Task Name: " + taskName + "\n" +
                "Task Description: " + description + "\n" +
                "Task ID: " + taskID + "\n" +
                "Task Duration: " + duration + " hours";
    }

    // Return the total amount of hours.
    public int returnTotalHours() {
        return duration;
        
    }
}
