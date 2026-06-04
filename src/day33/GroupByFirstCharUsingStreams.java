package day33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GroupByFirstCharUsingStreams {
public static void main(String[] args) {
	
	String str = "Nitin Pooja Pranav Akanksha Vedant Anil Naresh Prathamesh Abdul";
	//output : [[Nitin,Naresh],[Pooja, Pranav, Prathamesh] [Akanksha,Anil ,Abdul],[Vedant]]
	List<List<String>> firstCharGroups=getGroupsByFirstChar(str);
	System.out.println(firstCharGroups);
}

private static List<List<String>> getGroupsByFirstChar(String str) {
	String words[]=str.split(" ");
	
	List<List<String>> groups=Arrays.stream(words)
	.collect(Collectors.groupingBy(word->word.charAt(0)))
	.entrySet()
	.stream()
	.map(entry->entry.getValue())
	.toList();
	
	return groups;
	}

private static char getChar(String str) {	      
	return str.charAt(0);      
}
}


/*
{
'A' : [Akanksha, Anil, Abdul],
'P' : [Pooja, Pranav, Prathamesh],
'V' : [Vedant],
'N' : [Nitin, Naresh]
}

//[[Akanksha, Anil, Abdul], [Pooja, Pranav, Prathamesh],[Vedant],[Nitin, Naresh]]
*/