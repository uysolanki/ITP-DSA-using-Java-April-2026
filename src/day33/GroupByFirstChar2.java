package day33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GroupByFirstChar2 {
public static void main(String[] args) {
	
	String str = "Nitin Pooja Pranav Akanksha Vedant Anil Naresh Prathamesh Abdul";
	//output : [[Nitin,Naresh],[Pooja, Pranav, Prathamesh] [Akanksha,Anil ,Abdul],[Vedant]]
	List<List<String>> firstCharGroups=getGroupsByFirstChar(str);
	System.out.println(firstCharGroups);
}

private static List<List<String>> getGroupsByFirstChar(String str) {
	String words[]=str.split(" ");
	
	Map<Character,List<String>> hashmap=new HashMap();
	
	for(String word:words)
	{
		char ch=getChar(word);
		hashmap.putIfAbsent(ch, new ArrayList());
		
		hashmap.get(ch).add(word);
	}
	System.out.println(hashmap);
	
	List<List<String>> groups=new ArrayList();
	for(Entry<Character,List<String>> entry:hashmap.entrySet())
	{
		groups.add(entry.getValue());
	}
	return groups;
	}

private static char getChar(String str) {	      
	return str.charAt(0);      
}
}


