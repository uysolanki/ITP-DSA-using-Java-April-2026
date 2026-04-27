package day12;

import java.util.Scanner;

public class QueueDriverApp {

	public static void main(String[] args) {

		MyQueue mq=new MyQueue();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("*** Queue Menu ***");
			System.out.println("1. Insert");
			System.out.println("2. Remove");
			System.out.println("3. Display");
			System.out.println("0. Exit");
			
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1 : mq.insert(); break;
			case 2 : mq.remove(); break;
			case 3 : mq.display(); break;
			case 0 : System.exit(0); break;
			default : System.out.println("Invalid Input"); break;
			}
			
		}while(choice!=0);

	}

}
