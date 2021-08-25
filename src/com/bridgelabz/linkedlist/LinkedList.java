package com.bridgelabz.linkedlist;

import java.util.Collections;
import java.util.List;

public class LinkedList 
{
	public static void main(String[] args)
	{
		MyNode<Integer> myFirstNode=new MyNode<>(56);
		MyNode<Integer> mySecondtNode=new MyNode<>(30);
		MyNode<Integer> myThirdNode=new MyNode<>(70);
		MyNode<Integer> myFourthNode=new MyNode<>(40);
		MyLinkedList m=new MyLinkedList();
		m.add(myFirstNode);
		m.add(mySecondtNode);
		m.add(myThirdNode);
		m.print();
		m.insertAfter(30,myFourthNode);
		m.print();
		m.deleteMiddle(40);
		m.print();
	}
}
