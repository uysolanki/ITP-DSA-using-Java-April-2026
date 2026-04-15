package day6;

import java.util.Arrays;

public class BinarySearchUnSortedData {

	public static void main(String[] args) {
		//mid            mid
		//      0  1  2  3   4  5
	int arr[]= {40,50,60,10,20,30};
	int search=44;
	
	try
	{
	int index=search(arr,search);
	System.out.println(index==-1?"Not Found":"Found at Index " + index);
	}
	catch(NullPointerException ex1)
	{
		System.out.println(ex1.getMessage());
	}
	}

	private static int search(int[] arr, int search) {
		int mid=arr.length/2;
		if(search>=arr[0])
			return binarySearch(arr, search,0,mid-1) ;
		else
			return binarySearch(arr, search,mid,arr.length-1) ;
		
	}

	private static int binarySearch(int[] arr, int search,int start,int end) {
		if(arr==null ||arr.length==0)
			throw new NullPointerException("Invalid Array");
		
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

/* accept a array of size n
 * sort the array using n log n
 * left rotate the array on its mid
 * search for an element using log n
 */
