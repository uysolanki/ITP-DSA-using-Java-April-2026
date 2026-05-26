package day28;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharFromString1 {
public static void main(String[] args) {
	
	//String str="Springbot is java framework";// which char is repeated first?  output 'o'
	//n 0 4  == false
	//i 1 3  == false
	//t 2 2 == true
	String str="Nitin";// which char is repeated first?  output 'o'
	str=str.replaceAll("//s+", "").toLowerCase();
	char ch=firstRepeatedChar(str);
	System.out.println(ch=='0'?"no repeating char found":ch);

}

private static char firstRepeatedChar(String str) {

	char arr[]=str.toCharArray();
	for(char ch:arr)
	{
	if(str.indexOf(ch)==str.lastIndexOf(ch))
	return ch;
	}
	return '0';
}
}

/*
{
's':1
'p':1
}
*/

//longest common prefix   [flow flight flower]  answer "fl"

//Prakash Pranav Prathamesh   "Pra" 