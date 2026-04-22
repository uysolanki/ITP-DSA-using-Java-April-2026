package day10;

import java.util.Arrays;

public class ReverseStringWithoutExtraString {

	public static void main(String[] args) {
		//           i
		//          01234
		//String str="apple";                  //i=1 temp ='p' 	"elppa";
		String str="madam"; 
		System.out.println("Before "+str);
		char[] arr=str.toCharArray();
		int flag=0;
		for(int i=0;i<arr.length/2;i++)
		{
			if(arr[i]!=arr[arr.length-1-i])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("Not Palindrome");
		else
			System.out.println("Palindrome");
		

	}

}
