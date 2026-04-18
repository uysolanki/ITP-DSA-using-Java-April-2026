package day8;

import java.util.Scanner;

public class MyStack5 {

	private int[] stack=new int[5];
	private int top=-1;
	
	public void push(int data) {
			stack[++top]=data;	
	}

	
	public int pop() {
			return stack[top--];	
	}
	
	public void display() {
			for(int i=top;i>=0;i--)
				System.out.println(stack[i]);	
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
