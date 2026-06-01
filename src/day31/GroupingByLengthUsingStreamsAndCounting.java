package day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByLengthUsingStreamsAndCounting {

	public static void main(String[] args) {
		String str = "one two three three four five six seven eight nine ten";
		
		Map<Integer,List<String>>  hashmap=new HashMap();
		
		String arr[]=str.split(" "); //["one","two","three","four","five","six","seven","eight","nine","ten"];
		
		hashmap=Arrays.stream(arr).collect(Collectors.groupingBy(word->word.length()));
		
		System.err.println(hashmap);

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