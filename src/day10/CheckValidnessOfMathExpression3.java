package day10;

import java.util.Stack;

public class CheckValidnessOfMathExpression3 {

	public static void main(String[] args) {
		//String str="{[()]}";  //Valid
		//String str="{[(])}";    //Invalid	
		//String str="}[(])}";
		//String str="";
		//String str=null;
		String str="{[()]";
		System.out.println(checkValid(str)?"Valid":"Not Valid");
	}

	private static boolean checkValid(String str) {
		if(str==null || str.length()==0 ||str.length()%2==1) return false;
		
		MyStack stack=new MyStack(str);
																	
		for(char ch:str.toCharArray())			
		{										
			if(ch=='{' || ch=='[' || ch=='(')
			{
				stack.push(ch);
				continue;
			}
			
			if(stack.isEmpty()) return false;
			
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
