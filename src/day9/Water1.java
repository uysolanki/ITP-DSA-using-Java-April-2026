package day9;

import java.util.Arrays;

public class Water1 {
public static void main(String[] args) {
	//                   start              end
	int wallsHeight[]= {1, 8, 6, 2, 5, 4, 8, 3, 7};	
	int max=maxWaterCollection(wallsHeight);
	System.out.println(max);
}

private static int maxWaterCollection(int[] heights) {
	
	int start=0;					//start=0
	int end=heights.length-1;		//end= 8
	
	int maxWater=0;
	
	while(start<end)		//is 1<8
	{
		int height=Math.min(heights[start], heights[end]);	//7
		int length = end-start;								//7
		int area=height*length;								//area = 49
		
		if(area>maxWater)
			maxWater=area;									//maxWater=0,8,49
		
		if(heights[start]<=heights[end])					//1<=7
			start++;
		else
			end--;
	}
	
	return maxWater;
	
	
}


}
