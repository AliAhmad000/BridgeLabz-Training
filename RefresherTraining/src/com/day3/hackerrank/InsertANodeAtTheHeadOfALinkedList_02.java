package com.day3.hackerrank;

public class InsertANodeAtTheHeadOfALinkedList_02 {

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        if(llist==null){
           return new SinglyLinkedListNode(data);
        }
        SinglyLinkedListNode newNode=new SinglyLinkedListNode(data);
        newNode.next=llist;
        return newNode;

   }

	public static void main(String[] args) {
		
		SinglyLinkedListNode head=new SinglyLinkedListNode(5);
		head=insertNodeAtHead(head,10);
		head=insertNodeAtHead(head,30);
		head=insertNodeAtHead(head,90);
		head=insertNodeAtHead(head,80);
		PrintTheElementsOfALinkedList_01.printLinkedList(head);


	}
}
