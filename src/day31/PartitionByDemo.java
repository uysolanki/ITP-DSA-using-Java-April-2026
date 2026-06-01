package day31;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByDemo {

	public static void main(String[] args) {
		String str = "one two three four five six seven eight nine ten";
		String arr[]=str.split(" ");
		
		Map<Boolean,List<String>> hashmap=Arrays.stream(arr)
		.collect(Collectors.partitioningBy(word->word.length()>=4));
		
		System.out.println(hashmap);

	}

}

//{true:[three,four,five,seven,eight,nine],false:[one,two,six,ten]}

//{3:[],4[]:,5[]}