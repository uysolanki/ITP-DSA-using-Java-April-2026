package day29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringEncoding {
public static void main(String[] args) {
	
	String str="aaaabbbcc";  //output : "a4b3c2"
	
	
	Map<Character,Integer> hashmap=new LinkedHashMap();
	
	for(char key:str.toCharArray())
		hashmap.put(key, hashmap.getOrDefault(key, 0)+1);
	
	System.out.println(hashmap);
	
	StringBuffer sb=new StringBuffer();
	for(Entry<Character,Integer> entry:hashmap.entrySet())
	{
		sb.append(entry.getKey()).append(entry.getValue());
	}
	
	System.out.println(sb);
}
}
