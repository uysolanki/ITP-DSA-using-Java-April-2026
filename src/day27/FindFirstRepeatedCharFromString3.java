package day27;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatedCharFromString3 {
public static void main(String[] args) {
	
	String str="springboot";// which char is repeated first?  output 'o'
	
	//step 1 : convert string into char array
	char ch=firstRepeatedChar(str);
		System.out.println(ch=='0'?"no repeating char found":ch);

}

private static char firstRepeatedChar(String str) {
char arr[]=str.toCharArray();  //['s','p','r','i','n','g','b','o','o','t']
	
	Map<Character,Integer> hashmap=new HashMap();
	for(char ch:arr)			//ch='s'
	{
		hashmap.put(ch, hashmap.getOrDefault(ch, 0)+1);
	}
	
	//System.out.println(hashmap);
	
	for(char ch:arr)			//ch='s'
	{
		if(hashmap.get(ch)>1)
		{
			return ch;
		}
	}
	
	return '0';
}
}

/*
{
's':1
'p':1
}
*/