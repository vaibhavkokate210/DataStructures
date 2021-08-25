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
	
	public void insertBetween(INode myNode)
	{
		if(tail==null && head==null)
			System.out.println("List is empty");
		else
		{
			head.setNext(myNode);
			myNode.setNext(tail);
		}
	}
	public void deleteFirst()
	{
		if(tail==null & head==null)
			System.out.println("List is empty");
		else
		{
			INode iNode=head;
			head=head.getNext();
			iNode=null;
		}
	}
	public void deleteLast()
	{
		if(tail==null && head==null)
			System.out.println("List is empty");
		else
		{
			INode iNode=head;
			while(iNode.getNext()!=tail)
			{
				iNode=iNode.getNext();
			}
			tail=iNode;
			iNode.setNext(null);
		}
	}
	public void findNode(K find)
	{
		INode tempNode=head;
		int flag=0;
		while(tempNode!=null)
		{
			if(tempNode.getKey()==find)
			{
				System.out.println("Node found with value "+find);
				flag=1;
				break;
			}
			tempNode=tempNode.getNext();
		}
		if(flag==0)
		{
			System.out.println("Node with value "+find+" Not found");
		}
	}
	
	public void insertAfter(K after,INode iNode)
	{
		INode tempNode=head;
		while(tempNode!=null)
		{
			if(tempNode.getKey()==after)
			{
				iNode.setNext(tempNode.getNext());
				tempNode.setNext(iNode);
				break;
			}
			tempNode=tempNode.getNext();
		}
	}
	public void deleteMiddle(K delete)
	{
		INode tempNode1=head;
		INode tempNode2=head;
		while(tempNode1.getKey()!=delete)
		{
			tempNode2=tempNode1;
			tempNode1=tempNode1.getNext();
		}
		tempNode2.setNext(tempNode1.getNext());
		tempNode1.setNext(null);
		size();
	}
	public void size()
	{
		INode tempNode=head;
		int count=0;
		while(tempNode!=null) 
		{
		        tempNode=tempNode.getNext();
		        count++;
		}
		System.out.println("Size of linkedList = "+count);
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
