package day27;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedCharFromString7 {
public static void main(String[] args) {
	
	String str="abcda";// which char is repeated first?  output 'o'
	str=str.replaceAll("//s+", "").toLowerCase();
	char ch=firstRepeatedChar(str);
	System.out.println(ch=='0'?"no repeating char found":ch);

}

private static char firstRepeatedChar(String str) {
	Set<Character> hashset=new HashSet();
	Character chr=str.chars() //stream of integers    						//  [97,  98, 99, 100,97]
	.mapToObj(ch->(char)ch)
																			//->['a','b','c','d', 'e']
	.filter(ch->!hashset.add(ch))
	.findFirst()
	.orElse('0');
	return chr;	
}
}

/*
{
's':1
'p':1
}
*/