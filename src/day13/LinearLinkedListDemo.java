package day13;

import java.util.Scanner;

public class LinearLinkedListDemo {

	public static void main(String[] args) {
		Node head=null;
		head=createList(head);
		System.out.println("Display List After Creation");
		displayList(head);
		head=reverseList(head);
		System.out.println("Display List After Reverse");
		displayList(head);
	}

	private static Node reverseList(Node head) {
		Node left=null;
		Node right=null;
		Node current=head;
		
		while(current!=null)
		{
			right=current.getNext();
			current.setNext(left);
			left=current;
			current=right;
		}
		return left;
	}

	private static void displayList(Node head) {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.getData() + "->");
			temp=temp.getNext();
		}
		System.out.println("NULL");
		
	}

	private static Node createList(Node head) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of linked list");
		int size=sc.nextInt();
		Node temp=null;
		for(int i=1;i<=size;i++)
		{
			System.out.println("Enter the data for node "+ i + " :");
			int data=sc.nextInt();	//data=30
			
			Node nn=new Node(data);
			
			if(head==null)
			{
				head=nn;
				temp=nn;
			}
			else
			{
				temp.setNext(nn);
				temp=temp.getNext();
			}
		}
		return head;
	}

}
