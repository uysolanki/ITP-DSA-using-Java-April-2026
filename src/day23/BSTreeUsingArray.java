package day23;

import java.util.Scanner;

public class BSTreeUsingArray {
public static void main(String[] args) {
	Node root=null;
	int arr[]= {100,50,150,25,75,125,175,135};
	root=createBST(root,arr);
	System.out.print("Pre Order : ");
	preOrder(root);
	System.out.println();
	
	System.out.print("In Order : ");
	inOrder(root);
	System.out.println();
	
	System.out.print("Post Order : ");
	postOrder(root);
	System.out.println();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Node 1 to find ");	//125
	int n1=sc.nextInt();
	System.out.println("Enter Node 2 to find ");	//125
	int n2=sc.nextInt();
	Node ans=lowestCommonAncestor(root,n1,n2);
	System.out.println(String.format("Lowest Common Ancestor of %d & %d is %d",n1,n2,ans.getData()));
}

private static Node lowestCommonAncestor(Node root, int n1, int n2) {
	if(root==null)
		return null;
	
	if(n1> root.getData() && n2>root.getData())
	{
		return lowestCommonAncestor(root.getRight(), n1, n2);
	}
	
	if(n1< root.getData() && n2<root.getData())
	{
		return lowestCommonAncestor(root.getLeft(), n1, n2);
	}
	
	return root;
	
}

private static void preOrder(Node root) {
	if(root!=null)
	{
		System.out.print(root.getData() + ",");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	
}

private static void inOrder(Node root) {
	if(root!=null)
	{
		inOrder(root.getLeft());
		System.out.print(root.getData() + ",");
		inOrder(root.getRight());
	}
}


private static void postOrder(Node root) {
	if(root!=null)
	{
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getData() + ",");
	}
}
private static Node createBST(Node root, int arr[]) {
	
	for(int data:arr)
	{	
		Node nn=new Node(data);
		if(root==null)
		{
			root=nn;
		}
		else
		{
			insertNode(root,nn);
		}	
	}
	return root;
}

private static void insertNode(Node root, Node nn) 	//root			nn
{													//4000			5000
	if(nn.getData() >= root.getData())				//160  >= 175
	{
		if(root.getRight()==null)
		{
			root.setRight(nn);
		}
		else
		{
			insertNode(root.getRight(), nn);	
		}
	}
	else								//left side of root
	{
		if(root.getLeft()==null)
		{
			root.setLeft(nn);
		}
		else
		{
			insertNode(root.getLeft(), nn);	
		}
	}
	
}
}
