package day8;

import java.util.Scanner;

public class MyStack {

	private int[] stack=new int[5];
	private int top=-1;
	
	public void push() {
		if(isFull())
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
	
	public void pop() {
		if(isEmpty())
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
	
	public void display() {
		if(isEmpty())
		{
			System.out.println("Stack is Empty, Nothing to display");
		}
		else
		{
			for(int i=top;i>=0;i--)
				System.out.println(stack[i]);
		}
		
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
		return true;
		else
		return false;
	}
	
	public boolean isFull()
	{
		if(top==stack.length-1)
		return true;
		else
		return false;
	}
}
