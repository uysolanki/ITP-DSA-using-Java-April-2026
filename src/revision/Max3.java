package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Max3 {

	public static void main(String[] args) {
		int a=10,b=20,c=15;
		
//		if(a>b && a>c)
//			System.out.println(a + " is maximum");
//		else if(b>b && b>c)
//			System.out.println(b + " is maximum");
//		else
//			System.out.println(c + " is maximum");
		
		
//		int result=Math.max(Math.max(a, b),c);
//		System.out.println(result + " is maximum");
//		
//		
//		String name="madam";
//		String revName="";
//		for(int i=name.length()-1; i>=0;i--)
//			revName+=name.charAt(i);
//		
//		System.out.println(revName);
//		
//		StringBuffer str=new StringBuffer(name);
//		str.reverse();
//		System.out.println(str);
		
		//String name="madam";
		String name="apple";
		if(new StringBuffer(name).reverse().toString().equals(name))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
		
		List<String> names=new ArrayList(Arrays.asList("Alice","Alice","Ben","Chris"));
		Set<String> newNames=new LinkedHashSet(names);
		System.out.println(newNames);
		
		//remove string length>3  ConcurrentModificationException
//		List<String> names1=new ArrayList(Arrays.asList("Alice","Frank","Ben","Tom","Rahul"));
//		List<String> deletedNames=new ArrayList();
//		for(String str:names1)
//		{
//			if(str.length()>3)
//				deletedNames.add(str);
//		}
//		names1.removeAll(deletedNames);
//		System.out.println(names1);
		
		//
		
//		List<String> names2=new ArrayList(Arrays.asList("Alice","Frank","Ben","Tom","Rahul"));
//		List<String> remainingNames2=new ArrayList();
//		for(String str:names2)
//		{
//			if(str.length()<=3)
//				remainingNames2.add(str);
//		}
//		System.out.println(remainingNames2);
		
		
		List<String> names2=new ArrayList(Arrays.asList("Alice","Frank","Ben","Tom","Rahul"));
		List<String> remainingNames3=names2.stream().filter(str->str.length()<=3).toList();
		System.out.println(remainingNames3);
		
//		String sentance="Alice Frank Ben Tom Rahul";
//		int countOfWords=sentance.split(" ").length;
//		System.out.println(countOfWords);
//		
//		int counter=0;
//		for(char ch:sentance.toCharArray())
//		{
//			if(ch== ' ')
//				counter++;
//		}
//		
//		System.out.println(++counter);
		
		String sentance="Alice Frank Ben Tom Rahul";
		String arr[]=sentance.split(" ");
		System.out.println(Arrays.stream(arr).count());
	}

}
