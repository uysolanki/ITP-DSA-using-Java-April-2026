package day16;

import java.util.Scanner;


public class DoublyCircularLinkedListDemo {

	public static void main(String[] args) {
		Node head=null;
		head=createDoublyCircularLinkedList(head);
		System.out.println("Display after creation ");
		displayDoublyCircularLinkedList(head);

	}

	
	private static void displayDoublyCircularLinkedList(Node head) {
		Node temp=head;
		System.out.print(temp.getData()+"->");
		temp=temp.getNext();
		while(temp!=head)
		{
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		System.out.print(head.getData());
	}

	private static Node createDoublyCircularLinkedList(Node head) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Doubly Linked List");
		int size=sc.nextInt();
		Node temp=null;
		for(int i=1;i<=size;i++)
		{
			System.out.println("Enter data for Node "+i );
			int data=sc.nextInt();
			Node nn=new Node(data);
			
			
			if(head==null)
			{
				head=temp=nn;
				nn.setNext(head);
				nn.setPrev(head);
			}
			else
			{
				temp.setNext(nn);
				nn.setPrev(temp);
				head.setPrev(nn);
				nn.setNext(head);
				temp=temp.getNext();
			}
		}
		return head;
	}

	
	public static Node getNode()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data for Node ");
		int data=sc.nextInt();
		Node nn=new Node(data);
		return nn;
	}
}
