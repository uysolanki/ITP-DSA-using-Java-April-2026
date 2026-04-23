
public class RemoveAdjacentDuplicateCharsInString {
public static void main(String[] args) {
	
	String str="abbaca";		     		//aaca		ca  final output
	//String str1="acbbabc";		 		//acabc			final output
	String str1=removeAdjacentDuplicate(str);
	System.out.println(str1);
}

private static String removeAdjacentDuplicate(String str) {
	MyStack stack=new MyStack(str);
	stack.push(str.charAt(0));				//[a]
	
	for(int i=1;i<str.length();i++)
	{
		char ch=str.charAt(i);				//[b]
		if(!stack.isEmpty() && stack.peek()==ch)
			stack.pop();
		else
			stack.push(ch);
		
	}
	return  new String(stack.getStack());
}
}
