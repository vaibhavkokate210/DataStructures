package com.bridgelabz.linkedlist;

public class LinkedList 
{
	public static void main(String[] args)
	{
		MyNode<Integer> myFirstNode=new MyNode<>(56);
		MyNode<Integer> mySecondtNode=new MyNode<>(30);
		MyNode<Integer> myThirdNode=new MyNode<>(70);
		MyLinkedList m=new MyLinkedList();
		m.add(myFirstNode);
		m.add(myThirdNode);
		m.insertBetween(mySecondtNode);
		m.print();	
		m.deleteLast();
		m.print();
	}
}
