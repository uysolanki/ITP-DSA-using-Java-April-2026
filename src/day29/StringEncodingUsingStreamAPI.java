package day29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StringEncodingUsingStreamAPI {
public static void main(String[] args) {
	
	//String str="aaaabbbcc";  //output : "a4b3c2"
	String str="banana"; 
	
	Map<Character,Long> hashmap=new LinkedHashMap();
	
//	hashmap=str.chars()
//	.mapToObj(i->(char)i)
//	.collect(
//			Collectors.groupingBy(ch->ch,LinkedHashMap::new,Collectors.counting())
//			);
	
	//System.out.println(hashmap);
	
	String result=str.chars()
			.mapToObj(i->(char)i)
			.collect(Collectors.groupingBy(ch->ch,LinkedHashMap::new,Collectors.counting())					)
			.entrySet()
			.stream()
			.map(entry->""+entry.getKey()+entry.getValue())
			.collect(Collectors.joining());
	System.out.println(result);
	
}
}
