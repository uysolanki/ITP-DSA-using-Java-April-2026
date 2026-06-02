package day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupByAnagram {
public static void main(String[] args) {
	
	String str = "abc bac cba note tone silent listen mango";
	
	//output : [abc:[abc,bac,cba] enot:[tone,note],eilnst:[listen,silent],[mango]]
	//output : [[abc,bac,cba],[tone,note],[listen,silent],[mango]]  List<List<String>>
	
	String words[]=str.split(" ");  //[abc, bac, cba, note, tone, silent, listen, mango]
	Map<String,List<String>> hashmap=new HashMap();
	for(String word:words)		//abc
	{
		String key=getKey(word);  //"eilnst"
		hashmap.putIfAbsent(key, new ArrayList());
		
		hashmap.get(key).add(word);
	}
	
	/*{
		"eilnst" : [silent,listen]
		"abc" :    [abc,bac,cba]
		"enot" :   [tone,note],
		 agmno :   [mango]
	}*/
	
	System.out.println(hashmap);
	
	List<List<String>> groups=new ArrayList();
	
	for(Entry<String,List<String>> entry:hashmap.entrySet())
	{
		groups.add(entry.getValue());
	}
	
	System.out.println(groups);
	
}

private static String getKey(String str) { //str="silent"
	char arr[]=str.toCharArray(); //['s','i','l','e','n','t']
	Arrays.sort(arr);		      //['e','i','l','n','s','t']
	return new String(arr);       //"eilnst"	
}
}


/*
 {
 "abc" : []
 }
 */
