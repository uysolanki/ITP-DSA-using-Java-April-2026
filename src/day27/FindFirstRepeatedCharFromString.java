package day27;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatedCharFromString {
public static void main(String[] args) {
	
	String str="springboot";// which char is repeated first?  output 'o'
	
	//step 1 : convert string into char array
	char arr[]=str.toCharArray();  //['s','p','r','i','n','g','b','o','o','t']
	
	Map<Character,Integer> hashmap=new HashMap();
	for(char ch:arr)			//ch='s'
	{
		hashmap.put(ch, hashmap.getOrDefault(ch, 0)+1);
	}
	
	System.out.println(hashmap);
	
	int flag=0;
	for(char ch:arr)			//ch='s'
	{
		if(hashmap.get(ch)>1)
		{
			System.out.println(ch);
			flag=1;
			break;
		}
	}
	
	if(flag==0)
		System.out.println("no repeating char found");
}
}

/*
{
's':1
'p':1
}
*/