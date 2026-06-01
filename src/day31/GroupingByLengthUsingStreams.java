package day31;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByLengthUsingStreams {

	public static void main(String[] args) {
		String str = "one two three three four five six seven eight nine ten";
		

		
		String arr[]=str.split(" "); //["one","two","three","three","four","five","six","seven","eight","nine","ten"];
		//grouping by
		//key : logiic to be provided by developer
		//value : default type is List<Stream Type> i.e List<String>
		Map<Integer,Long>  hashmap=Arrays.stream(arr).collect(Collectors.groupingBy(word->word.length(),Collectors.counting()));
		
		System.out.println(hashmap);
		
		Map<Integer,String>  hashmap1=Arrays.stream(arr).collect(Collectors.groupingBy(word->word.length(),Collectors.joining()));
		System.out.println(hashmap1);
		
		Map<Integer,String>  hashmap2=Arrays.stream(arr).collect(Collectors.groupingBy(word->word.length(),Collectors.joining("-")));
		System.out.println(hashmap2);
		
		Map<Integer,List<String>>  hashmap3=Arrays.stream(arr).collect(Collectors.groupingBy(word->word.length()));
		System.out.println(hashmap3);
		
		Map<Integer,List<String>>  hashmap4=Arrays.stream(arr)
				.collect(Collectors.groupingBy(word->word.length(),Collectors.mapping(word->word.toUpperCase(),Collectors.toList())));
		System.out.println(hashmap4);
		
		Map<Integer,String>  hashmap5=Arrays.stream(arr)
				.collect(Collectors.groupingBy(word->word.length(),Collectors.mapping(word->word.toUpperCase(),Collectors.joining("-"))));
		System.out.println(hashmap5);
		
		
	}

}
/*
{3:[]}
*/

/*
3 : [one,two,six,ten]
4:  [four,five,nine]
5   [three,seven,eight]
*/

/*
3 : 4
4:  3
5   3
*/

//Joining
/*
3 : "onetwosixten"
4:  [four,five,nine]
5   [three,seven,eight]
*/