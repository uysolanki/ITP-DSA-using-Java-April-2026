package day8;

import java.util.Scanner;

public class MyStack3 {

	private int[] stack=new int[5];
	private int top=-1;
	
	public void push(Scanner sc,int data) {
		if(isFull())
			System.out.println("Stack is Full");
		else
		{
			top++;
			stack[top]=data;
		}
		
	}

	
	public int pop() {
		if(isEmpty())
		{
			return -1;
		}
		else
		{
			int data=stack[top];
			top--;
			return data;
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
