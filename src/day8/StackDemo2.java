package day8;

import java.util.Scanner;

public class StackDemo2 {

	private static int[] stack=new int[5];
	private static int top=-1;
	
	public static void main(String[] args) {
		int choice=0;
		do
		{
			System.out.println("**** Stack Menu ****");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("0. Exit");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Eneter Choice");
			choice=sc.nextInt();
			
			switch (choice)
			{
			case 1: push();break;
			case 2: pop();break;
			case 3: display();break;
			case 0:System.exit(0);			
			}
			
		}while(choice!=0);

	}

	private static void push() {
		if(top==stack.length-1)
		{
			System.out.println("Stack is Full");
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Data to Push");
			int data=sc.nextInt();
			top++;
			stack[top]=data;
		}
		
	}

	
	private static void pop() {
		if(top==-1)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			int data=stack[top];
			System.out.println(data + " is Poped");
			top--;
		}
		
	}
	
	private static void display() {
		if(top==-1)
		{
			System.out.println("Stack is Empty, Nothing to display");
		}
		else
		{
			for(int i=top;i>=0;i--)
				System.out.println(stack[i]);
		}
		
	}
}
