package day10;

import java.util.Arrays;

public class PalindromeStringWithoutExtraString {

	public static void main(String[] args) {
		//           i
		//          01234
		String str="apple";                  //i=1 temp ='p' 	"elppa";
		System.out.println("Before "+str);
		char[] arr=str.toCharArray();
		
		for(int i=0;i<arr.length/2;i++)
		{
			char temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		
		System.out.println("After "+Arrays.toString(arr));

	}

}
