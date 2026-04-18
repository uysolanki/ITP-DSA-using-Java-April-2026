package day8;

import java.util.Scanner;

public class StackDemo3 {

	public static void main(String[] args) {
		MyStack stack=new MyStack();
		int choice=0;
		do
		{
			System.out.println("**** Stack Menu ****");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("0. Exit");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			
			switch (choice)
			{
			case 1: stack.push();break;
			case 2: stack.pop();break;
			case 3: stack.display();break;
			case 0:System.exit(0);			
			}
			
		}while(choice!=0);
	}
	}
