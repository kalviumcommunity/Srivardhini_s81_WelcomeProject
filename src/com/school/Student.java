package com.school;

public class Student {
  int StudentID;
  String StudentName;  


public void studentDetails(int StudentID,String StudentName) {
    this.StudentID = StudentID;
    this.StudentName = StudentName;
  }

  public void displayDetails() {
    System.out.println("Student ID: " + StudentID);
    System.out.println("Student Name: " + StudentName);
  }
}
