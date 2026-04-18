package day8;

import java.util.Scanner;

public class StackDemo5 {

	public static void main(String[] args) {
		MyStack5 stack=new MyStack5();
		int choice=0;
		do
		{
			System.out.println("**** Stack Menu ****");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("0. Exit");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			
			switch (choice)
			{
			case 1:
				System.out.println("Enter Data to Push");
				int data=sc.nextInt();
				if(stack.isFull())
					System.out.println("Stack is Full");
				else
				stack.push(data);
				
				break;
			case 2: 
				if(stack.isEmpty())
					System.out.println("Stack is Empty");
				else
				{
				int data1=stack.pop();
				System.out.println(data1 +" is Poped");
				}
				
				break;
			case 3: 
				if(stack.isEmpty())
					System.out.println("Stack is Empty, Nothing to Display");
				else
					stack.display();
				
				break;
					
			case 0:System.exit(0);			
			}
			
		}while(choice!=0);
	}
	}
