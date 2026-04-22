package day9;

import java.util.Arrays;

public class Water2 {
public static void main(String[] args) {
	int wallsHeight[]= {4,2,0,3,2,5};	
	//int wallsHeight[]= {0,1,0,2,1,0,1,3,2,1,2,1}; 	
	int max=maxWaterCollection(wallsHeight);
	System.out.println(max);
}

private static int maxWaterCollection(int[] height) {
	int n=height.length;					//       i  
											//  {4,2,0,3,2,5} height
	
	int maxLeft[]=new int[n];				//	[4,4,4,4,4,5] maxLeft
	int maxRight[]=new int[n];				//	[5,5,5,5,5,5] maxRight
	maxLeft[0]=height[0];			//water     [0,2,4,1,2,0] = 9
	for(int i=1;i<n;i++)
	{
		maxLeft[i]=Math.max(height[i], maxLeft[i-1]);
	}	
	maxRight[n-1]=height[n-1];
	for(int i=n-2;i>=0;i--)
	{
		maxRight[i]=Math.max(height[i], maxRight[i+1]);
	}
	System.out.println("Left "+Arrays.toString(maxLeft));
	System.out.println("Right "+Arrays.toString(maxRight));
	int water=0;
	for(int i=0;i<n;i++)
		water+=(Math.min(maxLeft[i], maxRight[i]))-height[i];
	return water;
	
}


}
