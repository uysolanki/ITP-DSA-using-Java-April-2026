package day6;

public class BinarySearchDemo2 {

	public static void main(String[] args) {
	int arr[]= {10,20,30,40,50,60};
	int search=60;
	
	binarySearch(arr,search);
	}

	private static void binarySearch(int[] arr, int search) {
		int start=0;
		int end=arr.length;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(search==arr[mid])
			{
				System.out.println("Found");
				break;
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
		
		if(start>end)
			System.out.println("Not Found");

		
	}

}
