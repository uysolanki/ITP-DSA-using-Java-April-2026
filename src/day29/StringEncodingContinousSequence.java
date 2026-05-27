package day29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringEncodingContinousSequence {
public static void main(String[] args) {
	//            i
	String str="aaabbbccaa";  //output : "a4b3c2"
	
	
	StringBuilder sb=new StringBuilder();									//count 1,2,3
	int count=1;															
	for(int i=0;i<str.length();i++)
	{
		if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
		{
			count++;
		}
		else
		{
			sb.append(str.charAt(i)).append(count);
			count=1;
		}
	}
	
	System.out.println(sb);
}
}
