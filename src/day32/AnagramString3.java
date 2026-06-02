package day32;

import java.util.Arrays;

public class AnagramString3 {

	public static void main(String[] args) {
		String str1="silent";
		String str2="listen";
		
//		String str1="silent";
//		String str2="lister";
		
		System.out.println(checkAnagrams(str1,str2)?"Anagram":"Not Anagram");

	}

	private static boolean checkAnagrams(String str1, String str2) {

		if(str1.length()!=str2.length())
			return false;
		
		else
		{
			str1=getString(str1);
			str2=getString(str2);
			return str1.equals(str2)?true:false;	
		}
		
	}

	private static String getString(String str) {
		char arr[]=str.toCharArray(); //['s','i','l','e','n','t']
		Arrays.sort(arr);		      //['e','i','l','n','s','t']
		return new String(arr);       //"eilnst"	
	}

}
