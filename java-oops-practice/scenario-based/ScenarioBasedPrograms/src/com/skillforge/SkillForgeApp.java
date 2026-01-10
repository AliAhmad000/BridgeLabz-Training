package com.skillforge;

import java.lang.System.Logger.Level;

public class SkillForgeApp {
    public static void main(String[] args) {

        Instructor instructor = new Instructor("Prof. Gupta", "gupta@skillforge.com");
        System.out.println("Instructor Name: "+ instructor.getname());
        String[] modules = {"Java Basics", "OOP", "Collections", "Streams"};
        Course javaCourse = new Course("Core Java", instructor, modules);
        
        System.out.println("------Advanced Level Certificate------");
        Student student = new AdvancedStudent("Ali", "ali@gmail.com");
        student.updateProgress(4, javaCourse.getTotalModules());
        student.setScore(85);
        student.generateCertificate();
        
        System.out.println("------Beginner Level Certificate------");
        Student student1 = new BeginnerStudent("Gourav", "gourav@gmail.com");
        student1.updateProgress(4, javaCourse.getTotalModules());
        student1.setScore(75);
        student1.generateCertificate();
        System.out.println();
        Student student2 = new BeginnerStudent("Harshita", "harshita@gmail.com");
        student2.updateProgress(4, javaCourse.getTotalModules());
        student2.setScore(75);
        student2.generateCertificate();
    }
}
