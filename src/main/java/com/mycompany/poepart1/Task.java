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
    private String description;
    private String developerDetails;
    private int taskNum;
    private String taskID;
    private int duration;
    private String taskStatus;
    private static int totalHrs = 0;
    
    //Adding a constructor
    public Task(String taskName, String description, String developerDetails, int taskNum, int duration, String taskStatus) {
        this.taskName = taskName;
        this.description = description;
        this.developerDetails = developerDetails;
        this.taskNum = taskNum;
        this.duration = duration;
        this.taskStatus = taskStatus;
        this.taskID = createTaskID();
        totalHrs += duration;
        }
    
    //Checking task description
    public boolean checkTaskDescription(){
        if(this.description.length() > 50){
            JOptionPane.showMessageDialog(null,"Please endter a task description that is no more than 50 charcters long.");
            return false;
        }else{
            JOptionPane.showMessageDialog(null, "Task successfully Captured.");
            return true;
        }
    }
    // Creating task ID
    public String createTaskID(){
         String taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNum + ":" +
                developerDetails.substring(developerDetails.length() - 3).toUpperCase();
         return taskID;
    }
    //Printing task details
    public String printTaskDetails(){
                return "Task Status: " + this.taskStatus + "\n" +
                "Developer Details: " + this.developerDetails + "\n" +
                "Task Number: " + this.taskNum + "\n" +
                "Task Name: " + this.taskName + "\n" +
                "Task Description: " + this.description + "\n" +
                "Task ID: " + this.taskID + "\n" +
                "Task Duration: " + this.duration + " hours";
    }
    public static int returnTotalHours() {
        return totalHrs;
    }

   
    
}
