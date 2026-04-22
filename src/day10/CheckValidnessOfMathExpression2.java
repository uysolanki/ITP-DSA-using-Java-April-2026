package day10;

import java.util.Stack;

public class CheckValidnessOfMathExpression2 {

	public static void main(String[] args) {
		//String str="{[()]}";  //Valid
		String str="{[(])}";    //Invalid	
		System.out.println(checkValid(str)?"Valid":"Not Valid");
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
		
		return stack.isEmpty();
	}

}
