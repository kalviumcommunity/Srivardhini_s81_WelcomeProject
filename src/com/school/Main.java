package com.school;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        Course[] courses = new Course[2];

        
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].studentDetails(100 + i, "Student" + (i + 1));
        }

        for (int i = 0; i < courses.length; i++) {
            courses[i] = new Course();
            courses[i].courseDetails(200 + i, "Course" + (i + 1));
        }

        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.displayDetails();
        }

       
        System.out.println("\n--- Course Details ---");
        for (Course c : courses) {
            c.displayDetails();
        }
    }
}

