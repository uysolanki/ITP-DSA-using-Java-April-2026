package day17;

import java.util.Arrays;

public class Rotate2DArrayRight {
public static void main(String[] args) {
	
	int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
	
	int matrix2[][]= new int[3][3];
	System.out.println("Before");
	for(int row[]:matrix)
	System.out.println(Arrays.toString(row));
	
	int k=2;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			matrix2[j][k]=matrix[i][j];	
		}
		k--;
	}
	
	System.out.println("After");
	for(int row[]:matrix2)
	System.out.println(Arrays.toString(row));
}
}
