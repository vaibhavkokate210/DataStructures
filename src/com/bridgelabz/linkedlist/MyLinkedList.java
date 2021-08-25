package com.bridgelabz.linkedlist;

public class MyLinkedList<K>
{
	private INode head;
	private INode tail;
	
	public MyLinkedList() {
		super();
		this.head = null;
	}
	
	public void add(INode myNode)
	{
		if(tail==null)
			tail=myNode;
		if(head==null)
			head=myNode;
		else
		{
			tail.setNext(myNode);
			tail=myNode;
		}
	}
	
	public void print()
	{
		StringBuilder sb=new StringBuilder("List = ");
		INode tempNode=head;
		while(tempNode!= null)
		{
			sb.append(tempNode.getKey());
			if(!tempNode.equals(tail))
				sb.append("->");
			tempNode=tempNode.getNext();
		}
		System.out.println(sb);
	}
}
