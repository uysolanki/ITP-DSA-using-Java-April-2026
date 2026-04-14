package day3;

import java.util.Arrays;

public class MergeSortDemo {

	public static void main(String[] args) {
		int arr[]= {9,3,5,1,8,7}; //eiditic memory - photographic memory
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void mergeSort(int[] arr, int first, int last) 
	{
		if(first<last)
		{
		int mid=(first+last)/2;	
		mergeSort(arr,first,mid);
		mergeSort(arr,mid+1,last);
		assemble(arr,first,mid,last);
		}		
	}

	private static void assemble(int[] arr, int first, int mid, int last) {
		int brr[]=new int[arr.length];
		int i=first;
		int j=mid+1;
		int k=first;
		
		while(i<=mid && j<=last)
		{
			if(arr[i]>=arr[j])
			{
				brr[k]=arr[i];
				i++;
				k++;
			}
			else
			{
				brr[k]=arr[j];
				j++;
				k++;
			}
		}
		
		if(i>mid)
			for(int x=j;x<=last;x++)
				brr[k++]=arr[x];
		
		
		if(j>last)
			for(int x=i;x<=mid;x++)
				brr[k++]=arr[x];
		
		
		for(int m=first;m<=last;m++)
			arr[m]=brr[m];
	}

}
