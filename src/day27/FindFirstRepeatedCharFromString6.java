package day27;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedCharFromString6 {
public static void main(String[] args) {
	
	String str="Springboot is java framework";// which char is repeated first?  output 'o'
	str=str.replaceAll("//s+", "").toLowerCase();
	char ch=firstRepeatedChar(str);
	System.out.println(ch=='0'?"no repeating char found":ch);

}

private static char firstRepeatedChar(String str) {
char arr[]=str.toCharArray();  //['s','p','r','i','n','g','b','o','o','t']
	
	Set<Character> hashset=new HashSet();
	for(char ch:arr)			//hashset=['s','p','r','i','n','g','b','o'
	{
		if(!hashset.add(ch))
			return ch;
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