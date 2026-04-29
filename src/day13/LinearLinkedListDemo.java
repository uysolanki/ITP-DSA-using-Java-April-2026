package day13;

import java.util.Scanner;

public class LinearLinkedListDemo {

	public static void main(String[] args) {
		Node head=null;
		head=createList(head);
		System.out.println("Display List After Creation");
		displayList(head);
		head=addFirst(head);
		System.out.println("Display List After Adding First");
		displayList(head);
		
		addLast(head);
		System.out.println("Display List After Adding Last");
		displayList(head);
		
		addMid(head);
		System.out.println("Display List After Adding Middle");
		displayList(head);
			
//		
//		head=reverseList(head);
//		System.out.println("Display List After Reverse");
//		displayList(head);
	}

	private static void addMid(Node head) {
		Node temp=head;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Position to add");
		int position=sc.nextInt();	//position =4
		
		System.out.println("enter data for last node");
		int data=sc.nextInt();
		Node nn=new Node(data);
		
		int i=1;							//i			position
		while(i<position-1)					//1			4				1<3  true
		{									//2							2<3  true
			temp=temp.getNext();			//3							3<3  false
			i++;
		}
		nn.setNext(temp.getNext());
		temp.setNext(nn);
	}

	private static void addLast(Node head) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter data for last node");
		int data=sc.nextInt();
		Node nn=new Node(data);
		Node temp=head;
		while(temp.getNext()!=null)
			temp=temp.getNext();
		
		
		temp.setNext(nn);
		
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
	
	
	public static Node addFirst(Node head)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter data for first node");
	int data=sc.nextInt();
	Node nn=new Node(data);
	nn.setNext(head);
	head=nn;
	return head;
	}

}
