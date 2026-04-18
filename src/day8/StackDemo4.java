package day8;

import java.util.Scanner;

public class StackDemo4 {

	public static void main(String[] args) {
		MyStack2 stack=new MyStack2();
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
			case 1: stack.push(sc);break;
			case 2: stack.pop();break;
			case 3: stack.display();break;
			case 0:System.exit(0);			
			}
			
		}while(choice!=0);
	}
	}
