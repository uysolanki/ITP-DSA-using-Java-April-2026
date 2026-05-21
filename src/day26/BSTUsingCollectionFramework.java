package day26;

import java.util.Set;
import java.util.TreeSet;

public class BSTUsingCollectionFramework {
public static void main(String[] args) {
	int arr[]={100,50,150,25,75,125,175,135};
	Set<Integer> tree=new TreeSet();
	
	for(int n:arr)
		tree.add(n);
	
	System.out.println(tree);
}
}
