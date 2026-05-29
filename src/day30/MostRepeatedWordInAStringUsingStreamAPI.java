package day30;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MostRepeatedWordInAStringUsingStreamAPI {
public static void main(String[] args) {
	String str="one one one two two one three three four";
	
	String arr[]=str.split(" "); //["one", "one", "one", "two", "two", "one", "three", "three", "four"]
	
	Map<String,Long> hashmap=new HashMap();
	
	hashmap=Arrays
			.stream(arr)
			.collect(Collectors.groupingBy(
			word->word,Collectors.counting()		
			));
		
	System.out.println(hashmap);
	
	/*
	 {one :4,
	 two: 2,
	 three:2,
	 four : 1}
	 */
	
	Entry<String,Long> maxEntry=hashmap.entrySet().stream()
	.max(Map.Entry.comparingByValue())
	.orElse(null);
	
	
	System.out.println("Word with maximum occurance : "+maxEntry.getKey()+ "->" + maxEntry.getValue());
}
}
