package com.linkedlist.circularlinkedlist.taskschedular;

public class Node {
    int taskid;
    String name;
    int priority;
    String duedate;
    Node next;

    Node(int taskid, String name, int priority, String duedate) {
        this.taskid = taskid;
        this.name = name;
        this.priority = priority;
        this.duedate = duedate;
        this.next = this;
    }
}
