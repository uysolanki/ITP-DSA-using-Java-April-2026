package day14;

import java.util.Scanner;

public class StackUsingLinkedList {

	public static void main(String[] args) {
		DynamicStack2 stack=new DynamicStack2();
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
