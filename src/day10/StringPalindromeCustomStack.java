package day10;

public class StringPalindromeCustomStack {

	public static void main(String[] args) {
		String str="apple";
		String str1="";
		System.out.println("Before "+str);
		
		MyStack stack=new MyStack(str);
		for(int i=0;i<str.length();i++)
			stack.push(str.charAt(i));
		
		stack.display();
		
		while(!stack.isEmpty())
			str1+=stack.pop();
		
		System.out.println("After "+str1);
		
//		if(str.equals(str1))
//			System.out.println("Palindrome");
//		else
//			System.out.println("Not Palindrome");
		
		System.out.println(str.equals(str1)?"Palindrome":"Not Palindrome");
		
	}

}
