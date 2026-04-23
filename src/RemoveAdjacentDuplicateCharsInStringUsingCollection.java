import java.util.Stack;

public class RemoveAdjacentDuplicateCharsInStringUsingCollection {
public static void main(String[] args) {
	
	//String str="abbaca";		     		//aaca		ca  final output
	String str="abbbaca";	
	//String str1="acbbabc";		 		//acabc			final output
	String str1=removeAdjacentDuplicate(str);
	System.out.println(str1);
}

private static String removeAdjacentDuplicate(String str) {
	Stack<Character> stack=new Stack();
	stack.push(str.charAt(0));				//[a]
	
	for(int i=1;i<str.length();i++)
	{
		char ch=str.charAt(i);				//b
		if(!stack.isEmpty() && stack.peek()==ch)
			stack.pop();
		else
			stack.push(ch);
		
	}

	StringBuffer sb=new StringBuffer();
	while(!stack.isEmpty())
	{
		sb.append(stack.pop());
	}
	
	return sb.reverse().toString();
}
}
