package day28;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountDuplicateCharacters {

	public static void main(String[] args) {
		String str="nitin"; 		//{n=2,i=2}  //using stream API
		
		Map<Character,Integer> hashmap=new HashMap();
		
		for(char key:str.toCharArray())
			hashmap.put(key, hashmap.getOrDefault(key,0)+1);
		
		for(Entry<Character,Integer> entry:hashmap.entrySet())
		{
			if(entry.getValue()>1)
				System.out.printf("%c : %d\n",entry.getKey(),entry.getValue());
		}

	}

}
