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
    // Declarations for the attributes of the Task class.
    private String taskName;                // Name of the task.
    private int taskNum;                    // Unique number associated with the task. 
    private String description;             // Description of the task (maximum length of 50 characters).
    private String developerDetails;        // Name and surname of the developer assigned to the task.
    private int duration;                   // Estimated duration to complete the task (in hours).
    private String taskStatus;              // Current status of the task (e.g., "To Do", "In Progress", "Done").
    private String taskID;                  // Unique ID for the task, auto-generated

    // Constructor to initialize a new Task object with the provided details.
    public Task(String taskName, int taskNum, String description, String developerDetails, int duration, String taskStatus) {
        this.taskName = taskName;
        this.taskNum = taskNum;
        this.description = description;
        this.developerDetails = developerDetails;
        this.duration = duration;
        this.taskStatus = taskStatus;
        this.taskID = createTaskID(); // This generates a unique task ID upon creation.
    }

    // Check if the task description is valid.[No more than 50 characters in length]
    public boolean checkTaskDescription() {
        return this.description.length() <= 50;
    }

    // Generates a unique Task ID in the format: [First 2 letters of taskName]:[taskNum]:[Last 3 letters of developerDetails]
    public String createTaskID() {
        String taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNum + ":" +
                developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        return taskID;
    }

    // Print task details through a formatted String 
    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n" +
                "Developer Details: " + developerDetails + "\n" +
                "Task Number: " + taskNum + "\n" +
                "Task Name: " + taskName + "\n" +
                "Task Description: " + description + "\n" +
                "Task ID: " + taskID + "\n" +
                "Task Duration: " + duration + " hours";
    }

    // Return the total amount of hours required for the task.
    public int returnTotalHours() {
        return duration;    
    }
}
