package day10;

public class MyStack {

	private char[] stack;
	private int top=-1;
	
	 public MyStack(String str)
	 {
		 stack=new char[str.length()];
	 }
	
	public void push(char data) {
			stack[++top]=data;	
	}

	
	public char pop() {
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
