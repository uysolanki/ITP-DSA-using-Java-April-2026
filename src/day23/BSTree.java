package day23;

import java.util.Scanner;

public class BSTree {
public static void main(String[] args) {
	Node root=null;
	root=createBST(root);
	preOrder(root);
}

private static void preOrder(Node root) {
	if(root!=null)
	{
		System.out.println(root.getData() + ",");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	
}

private static Node createBST(Node root) {
	Scanner sc=new Scanner(System.in);
	int choice=0;
	do
	{
		System.out.println("Enter data to insert");	//125
		int data=sc.nextInt();
		
		Node nn=new Node(data);
		if(root==null)
		{
			root=nn;
		}
		else
		{
			insertNode(root,nn);
		}
		
		
		System.out.println("Do you want to continue? 1-yes 0-No");
		choice=sc.nextInt();
		
	}while(choice==1);
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
