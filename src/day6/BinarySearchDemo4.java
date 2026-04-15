package day6;

import java.util.Arrays;

public class BinarySearchDemo4 {

	public static void main(String[] args) {
//	int arr[]= {10,20,30,40,50};
//	int search=60;
		
	//int arr[]= {};
	//int arr[]=null;
	int arr[]= {60,20,30,40,50,10};
	// int arr[]= {60};
	Arrays.sort(arr);
	
	int search=60;
	try
	{
	int index=binarySearch(arr,search);
	System.out.println(index==-1?"Not Found":"Found at Index " + index);
	}
	catch(NullPointerException ex1)
	{
		System.out.println(ex1.getMessage());
	}
	}

	private static int binarySearch(int[] arr, int search) {
		if(arr==null ||arr.length==0)
			throw new NullPointerException("Invalid Array");
		int start=0;				//first index
		int end=arr.length-1;		//last index
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(search==arr[mid])
				return mid;
			else if(search>arr[mid])
				start=mid+1;
			else
				end=mid-1;		
		}	
		return -1;
	}

}
