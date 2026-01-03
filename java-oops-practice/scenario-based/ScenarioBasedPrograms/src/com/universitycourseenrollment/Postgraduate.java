package com.universitycourseenrollment;

public class Postgraduate extends Student {

    public Postgraduate(int id, String name) {
        super(id, name);
    }

    public void displayInfo() {
        System.out.println("Postgraduate Student: " + name);
    }
}
