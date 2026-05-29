package day30;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostRepeatedWordInAStringUsingCollection2 {
public static void main(String[] args) {
	String str="one one one two two one three three four";
	
	String arr[]=str.split(" "); //["one", "one", "one", "two", "two", "one", "three", "three", "four"]
	
	Map<String,Integer> hashmap=new HashMap();
	
	for(String key:arr)
		hashmap.put(key, hashmap.getOrDefault(key, 0)+1);
	
	
	/*
	 {one :4,
	 two: 2,
	 three:2,
	 four : 1}
	 */
	
	String maxKey="";
	int maxValue=0;
	for(Entry<String,Integer> entry:hashmap.entrySet())
	{
		if(entry.getValue()>maxValue)
		{
			maxKey=entry.getKey();
			maxValue=entry.getValue();
		}
	}
	
	System.out.println("Word with maximum occurance : "+maxKey+ "->" + maxValue);
}
}
