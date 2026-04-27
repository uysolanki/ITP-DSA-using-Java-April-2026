package day12;

import java.util.Scanner;

public class QueueDriverApp2 {

	public static void main(String[] args) {

//		MyQueue mq=new MyQueue();
//		MyQueue2 mq=new MyQueue2();
		MyQueue3 mq=new MyQueue3();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("*** Queue Menu ***");
			System.out.println("1. Insert");
			System.out.println("2. Remove");
			System.out.println("3. Display");
			System.out.println("0. Exit");
			
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1 : 
				if(mq.isFull())
					System.out.println("Queue is Full");
				else
				{
					System.out.println("Enter a Number");
					int data=sc.nextInt();
					mq.insert(data);
				}
				break;
			case 2 :
				if(mq.isEmpty())
					System.out.println("Queue is Empty");
				else
				{
					int data=mq.remove();
					System.out.println(data + " is removed");
				}
				 break;
			case 3 : 
				if(mq.isEmpty())
					System.out.println("Queue is Empty, Nothing to display");
				else
				mq.display(); 
				break;
				
			case 0 : System.exit(0); break;
			
			default : System.out.println("Invalid Input"); break;
			}
			
		}while(choice!=0);

	}

}
