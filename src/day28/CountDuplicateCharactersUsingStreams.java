package day28;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CountDuplicateCharactersUsingStreams {

	public static void main(String[] args) {
		String str="nitin"; 		//{n=2,i=2}  //using stream API
		
		Map<Character,Long> hashmap=new HashMap();
		
		hashmap=str.chars()
		.mapToObj(i->(char)i)
		.collect(Collectors.groupingBy(ch->ch, Collectors.counting()));
		
		hashmap.entrySet().stream()
		.filter(entry->entry.getValue()>1)
		.forEach(System.out::println);

	}
}

