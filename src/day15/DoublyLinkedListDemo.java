package day15;

import java.util.Scanner;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		Node head=null;
		head=createDoublyLinkedList(head);
		System.out.println("Display after creation ");
		displayDoublyLinkedList(head);
	}

	private static void displayDoublyLinkedList(Node head) {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		System.out.println("NULL");
		
	}

	private static Node createDoublyLinkedList(Node head) {
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
			}
			else
			{
				nn.setPrev(temp);
				temp.setNext(nn);
				temp=temp.getNext();
			}
		}
		return head;
	}

}
