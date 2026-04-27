package day12;

import java.util.Scanner;

public class MyQueue {
	
	int queue[]=new int[5];
	int rear=-1;
	int front=0;
	
	void insert()
	{
		Scanner sc=new Scanner(System.in);
		if(rear==queue.length-1)
			System.out.println("Queue is Full");
		else
		{
			System.out.println("Enter a Number");
			rear++;
			queue[rear]=sc.nextInt();
		}
		
	}
	
	void remove()
	{
		if(front>rear)
			System.out.println("Queue is Empty");
		else
		{
		int data=queue[front];		//data=10
		System.out.println(data + " is removed");
		front++;
		}
		
	}
	
	void display()
	{
		if(front>rear)
			System.out.println("Queue is Empty, Nothing to display");
		else
			for(int i=front;i<=rear;i++)
				System.out.println(queue[i]);
	}

}
