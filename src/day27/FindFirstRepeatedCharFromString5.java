package day27;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatedCharFromString5 {
public static void main(String[] args) {
	
	String str="Springbot is java framework";// which char is repeated first?  output 'o'
	str=str.replaceAll("//s+", "").toLowerCase();
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