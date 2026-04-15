package day6;

public class BinarySearchDemo {

	public static void main(String[] args) {
	int arr[]= {10,20,30,40,50,60};
	int search=51;
	
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
