    package com.school;

    public class Course {
    int CourseID;
    String CourseName;  


    public void courseDetails(int CourseID, String CourseName) {
        this.CourseID = CourseID;
        this.CourseName = CourseName;
    }

    public void displayDetails() {    
        System.out.println("Course ID: " + CourseID);
        System.out.println("Course Name: " + CourseName);
    }
    }