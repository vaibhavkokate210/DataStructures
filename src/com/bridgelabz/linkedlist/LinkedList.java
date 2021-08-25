package com.bridgelabz.linkedlist;

public class LinkedList 
{
	public static void main(String[] args)
	{
		MyNode<Integer> myFirstNode=new MyNode<>(70);
		MyNode<Integer> mySecondtNode=new MyNode<>(30);
		MyNode<Integer> myThirdNode=new MyNode<>(56);
		MyLinkedList m=new MyLinkedList();
		m.add(myFirstNode);
		m.add(mySecondtNode);
		m.add(myThirdNode);
		m.print();	
	}
}
