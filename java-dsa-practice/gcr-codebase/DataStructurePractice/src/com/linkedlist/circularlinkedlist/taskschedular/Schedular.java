package com.linkedlist.circularlinkedlist.taskschedular;

import java.security.PublicKey;
import java.util.Currency;

public class Schedular {
	private Node head;

	// adding task at the beginning
	public void addAtBeginning(int taskid, String name, int priority, String duedate) {
	    Node newNode = new Node(taskid, name, priority, duedate);

	    if (head == null) {
	        head = newNode;
	        return;
	    }

	    Node temp = head;
	    while (temp.next != head) {
	        temp = temp.next;
	    }

	    temp.next = newNode;
	    newNode.next = head;
	    head = newNode;
	}

 
 // adding task at the end
public void addAtEnd(int taskid, String name, int priority, String duedate) {
    Node newNode = new Node(taskid, name, priority, duedate);

    if (head == null) {
        head = newNode;
        return;
    }

    Node temp = head;
    while (temp.next != head) {
        temp = temp.next;
    }

    temp.next = newNode;
    newNode.next = head;
}

 
 // adding task at a specific position
 public void addAtSpecificPosition(int taskid, String name, int priority,
         String duedate, int position) {
if (position == 0) {
addAtBeginning(taskid, name, priority, duedate);
return;
}

Node newNode = new Node(taskid, name, priority, duedate);
Node temp = head;

for (int i = 0; i < position - 1 && temp.next != head; i++) {
temp = temp.next;
}

newNode.next = temp.next;
temp.next = newNode;
}

		// deletion of the node
	public boolean removeItem(int id) {
	    if (head == null) return false;

	    Node curr = head;
	    Node prev = null;

	    do {
	        if (curr.taskid == id) {
	            if (prev != null) {
	                prev.next = curr.next;
	            } else {
	                Node last = head;
	                while (last.next != head) {
	                    last = last.next;
	                }
	                head = head.next;
	                last.next = head;
	            }
	            return true;
	        }
	        prev = curr;
	        curr = curr.next;
	    } while (curr != head);

	    return false;
	}

	   
	//   Display method
	public void display() {
	    if (head == null) {
	        System.out.println("List is empty");
	        return;
	    }

	    Node temp = head;
	    do {
	        System.out.println(
	            "Task ID: " + temp.taskid +
	            ", Name: " + temp.name +
	            ", Priority: " + temp.priority +
	            ", Due Date: " + temp.duedate
	        );
	        temp = temp.next;
	    } while (temp != head);
	}


	  

	
 }

