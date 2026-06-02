package day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GroupByAnagramUsingStreams3 {
public static void main(String[] args) {
	
	String str = "abc bac cba note tone silent listen mango";
	List<List<String>> anagramGroups=getGroupsOfAnagrams(str);
	System.out.println(anagramGroups);
}

private static List<List<String>> getGroupsOfAnagrams(String str) {
	String words[]=str.split(" ");
	List<List<String>> groups=new ArrayList();
	
	groups=Arrays.stream(words)
	.collect(Collectors.groupingBy(GroupByAnagramUsingStreams3::getString))
	.entrySet()
	.stream()
	.map(entry->entry.getValue())
	.toList();
	
	return groups;

}

private static String getString(String str) {
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
