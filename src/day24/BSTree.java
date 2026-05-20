package day24;

import java.util.Scanner;

public class BSTree {
public static void main(String[] args) {
	Node root=null;
	root=createBST(root);
	System.out.print("Pre Order : ");
	preOrder(root);
	System.out.println();
	
	System.out.print("In Order : ");
	inOrder(root);
	System.out.println();
	
	System.out.print("Post Order : ");
	postOrder(root);
	System.out.println();
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
private static Node createBST(Node root) {
	Scanner sc=new Scanner(System.in);
	int choice=0;
	do
	{
		System.out.println("Enter name to insert");	//125
		String data=sc.next();
		
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
	if(nn.getData().compareTo(root.getData())>=1)				//160  >= 175
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
