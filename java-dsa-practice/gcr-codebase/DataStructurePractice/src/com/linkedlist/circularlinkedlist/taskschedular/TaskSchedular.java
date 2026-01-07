package com.linkedlist.circularlinkedlist.taskschedular;

public class TaskSchedular {
public static void main(String[] args) {
	
	Schedular s=new Schedular();
	s.addAtBeginning(1, "Go to Nishchal Sir For talk", 10, "06-01-2026");
	s.addAtEnd(2, "Go to Nishchal Sir For talk hasfufb", 6, "06-01-2026");
	s.addAtBeginning(3, "Dora the explora", 1, "08-01-2026");
	s.addAtSpecificPosition(4, "jay ho", 7, "09-01-2016", 2);
	s.display();
	s.removeItem(2);
	s.display();
}
}