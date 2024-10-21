/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1;

/**
 *
 * @author RC_Student_lab
 */
class Task {
    //Declarations
    private String taskName;
    private String description;
    private String developerName;
    private int taskNum;
    private String taskID;
    private int duration;
    private String taskStatus;
    private static int totalHrs = 0;
    
    //Adding a constructor
    public Task(String taskName, String taskDescription, String developerDetails, int taskNumber, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.description = taskDescription;
        this.developerName = developerDetails;
        this.taskNum = taskNumber;
        this.duration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskID = createTaskID();
        totalHrs += taskDuration;
    
    
}
