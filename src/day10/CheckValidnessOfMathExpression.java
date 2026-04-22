package day10;

import java.util.Stack;

public class CheckValidnessOfMathExpression {

	public static void main(String[] args) {
		//String str="{[()]}";  //Valid
		String str="{[(])}";    //Invalid
		
		boolean result=checkValid(str);
		if(result==true)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

	private static boolean checkValid(String str) {
		MyStack stack=new MyStack(str);
																	
		for(char ch:str.toCharArray())			
		{										
			if(ch=='{' || ch=='[' || ch=='(')
			{
				stack.push(ch);
				continue;
			}
			
			char zh=stack.pop();
			switch(ch)
			{
			case ')' : if(zh=='{' || zh=='[') return false; break;
			case ']' : if(zh=='{' || zh=='(') return false; break;
			case '}' : if(zh=='(' || zh=='[') return false; break;
			}
		}
		if(stack.isEmpty()) return true; 
		else return false;
	}

}
