package day31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupingByLengthUsingCollection {

	public static void main(String[] args) {
		String str = "one two three three four five six seven eight nine ten";
		
		Map<Integer,List<String>>  hashmap=new HashMap();
		
		String arr[]=str.split(" "); //["one","two","three","three","four","five","six","seven","eight","nine","ten"];
		for(String word:arr)		//word
		{							//one
			int key=word.length();
			hashmap.putIfAbsent(key, new ArrayList());
			
			hashmap.get(key).add(word);//[]
		}
		
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