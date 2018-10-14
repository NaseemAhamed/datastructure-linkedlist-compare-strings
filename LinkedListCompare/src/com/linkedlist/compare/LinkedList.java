package com.linkedlist.compare;

public class LinkedList {
	Node head;
	static Node a, b;

	static class Node {
		char data;
		Node next;

		Node(char d) {
			data = d;
			next = null;
		}
	}
	
	 int compare (Node node1, Node node2)
	{
		 
	if(node1==null && node2==null)
	{
		return 1;		
	}
	
	
	//Move the pointers as long as both lists are equal
	while(node1!=null && node2!=null && node1.data==node2.data)
	{
	node1=node1.next;
	node2=node2.next;
	}
	
	
	//Different size case
	if(node1!=null && node2!=null)
	{
		return (node1.data > node2.data ? 1:-1);
	}
	
	if(node1!=null && node2==null)
	{
		return 1;
	}
	if(node1==null && node2!=null)
	{
		return -1;
	}
	
		 return 0;
		
	}
	 
	 public static void main(String args[])
	 {
		 LinkedList list=new LinkedList();
		 
		 list.a=new Node('p');
		 list.a.next=new Node('i');
		 list.a.next.next=new Node('k');
		 list.a.next.next.next=new Node('a');
		 list.a.next.next.next.next=new Node('c');
		 list.a.next.next.next.next.next=new Node('h');
		 list.a.next.next.next.next.next.next=new Node('u');
		 
		 
		 list.b=new Node('p');
		 list.b.next=new Node('i');
		 list.b.next.next=new Node('k');
		 list.b.next.next.next=new Node('a');
		 list.b.next.next.next.next=new Node('c');
		 list.b.next.next.next.next.next=new Node('h');
		 list.b.next.next.next.next.next.next=new Node('U'); //Capital letter
		 
		 System.out.println("Compare result -- " + list.compare(a, b));
		 
	 }
}
