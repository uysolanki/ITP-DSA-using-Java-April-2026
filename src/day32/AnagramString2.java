package day32;

import java.util.Arrays;

public class AnagramString2 {

	public static void main(String[] args) {
		String str1="silent";
		String str2="listen";
		
//		String str1="silent";
//		String str2="lister";
		
		System.out.println(checkAnagrams(str1,str2)?"Anagram":"Not Anagram");

	}

	private static boolean checkAnagrams(String str1, String str2) {

		
		
		int len1=str1.length();
		int len2=str2.length();
		
		if(len1!=len2)
			return false;
		
		else
		{
			char arr1[]=str1.toCharArray(); //['s','i','l','e','n','t']
			char arr2[]=str2.toCharArray(); //['l','i','s','t','e','n']
			
			Arrays.sort(arr1);		//['e','i','l','n','s','t']
			Arrays.sort(arr2);		//['e','i','l','n','s','t']
			
			String s1=new String(arr1); //"eilnst"
			String s2=new String(arr2); //"eilnst"
			
			return s1.equals(s2)?true:false;
			
		}
		
	}

}
