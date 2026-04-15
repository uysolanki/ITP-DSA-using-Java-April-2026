package day6;

public class BinarySearchDemo3 {

	public static void main(String[] args) {
	int arr[]= {10,20,30,40,50,60};
	int search=55;
	
	//int index=binarySearch(arr,search);
	int index=binarySearchRecursion(arr,search,0,arr.length-1);
	if(index==-1)
		System.out.println("Not Found");
	else
		System.out.println("Found at Index " + index);
	}

	private static int binarySearch(int[] arr, int search) {
		int start=0;
		int end=arr.length;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(search==arr[mid])
			{
				return mid;
			}
			else if(search>arr[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
				
		}
		
		return -1;

		
	}
	
	
	private static int binarySearchRecursion(int[] arr, int search,int start,int end) {
		
		if(start<=end)
		{
			int mid=(start+end)/2;
			if(search==arr[mid])
				return mid;
			else if(search>arr[mid])
				 return binarySearchRecursion(arr,search,mid+1,end);
			else
				return binarySearchRecursion(arr,search,start,mid-1);		
		}
		
		return -1;

		
	}

}
