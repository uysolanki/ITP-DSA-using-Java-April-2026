package day18;

import java.util.Scanner;

public class LinearLinkedListDemo {

	public static void main(String[] args) {
		Node head=null;
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("*** Reservation Menu ***");
			System.out.println("1. Make A Reservation");
			System.out.println("2. View Reservation");
			System.out.println("3. Cancel Reservation By Seat Number");
			System.out.println("4. View All Reservations");
			System.out.println("0. Exit");
			
			System.out.println("Enter choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1 : head=makeReservation(head); break;
			case 2 : 
				System.out.println("*** View Options ***");
				System.out.println("1. View Reservation By Passenger Name");
				System.out.println("2. View Reservation By Seat Number");
				System.out.println("0. Back to Main Menu");
				System.out.println("Enter choice");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1 :System.out.println("Enter Passenger Name to search"); 
						String pasName=sc.next();
						int ans=viewReservationByPassengerName(head,pasName); break;
				case 2 : System.out.println("Enter Seat Number to search"); 
						int sno=sc.nextInt();
						int ans1=viewReservationBySeatNumber(head,sno); 
						if(ans1==0)
							System.out.println("Record does not exist");
						break;
				case 0 : break;
				} 
				break;
//			case 3 : cancelReservation(); break;
			case 4 : viewAllReservations(head); break;
			case 5 :System.exit(0);
			}
		}while(choice!=0);
	}

	private static int viewReservationBySeatNumber(Node head,int sno) {
		Node temp=head;
		int flag=0;
		while(temp!=null)
		{
			if(temp.getSeatNo()==sno)
			{
			flag=1;
			System.out.println(String.format("%-20s%d","Passenger Age ",temp.getPassAge()));
			System.out.println(String.format("%-20s%s","Passenger Name ", temp.getPassName()));
			System.out.println(String.format("%-20s%d","Seat Numbet ",+temp.getPassAge()));
			System.out.println("--------------------");
			}
			temp=temp.getNext();
		}
		return flag;
		
	}

	private static int viewReservationByPassengerName(Node head, String pasName) {
		Node temp=head;
		int flag=0;
		while(temp!=null)
		{
			if(temp.getPassName().equalsIgnoreCase(pasName))
			{
			flag=1;
			System.out.println(String.format("%-20s%d","Passenger Age ",temp.getPassAge()));
			System.out.println(String.format("%-20s%s","Passenger Name ", temp.getPassName()));
			System.out.println(String.format("%-20s%d","Seat Numbet ",+temp.getPassAge()));
			System.out.println("--------------------");
			}
			temp=temp.getNext();
		}
		return flag;
		
	}

	private static void viewAllReservations(Node head) {
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(String.format("%-20s%d","Passenger Age ",temp.getPassAge()));
			System.out.println(String.format("%-20s%s","Passenger Name ", temp.getPassName()));
			System.out.println(String.format("%-20s%d","Seat Numbet ",+temp.getPassAge()));
			System.out.println("--------------------");
			temp=temp.getNext();
		}
		
		
	}

	private static Node makeReservation(Node head) {
		Node nn=getNode();
		Node temp=head;		//temp=1000
		if(head==null)
		{
			temp=head=nn;
		}
		else
		{
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			
			temp.setNext(nn);
		}
		return head;
	}

	private static Node getNode() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Seat Number"); //position=3
		int seatNo=sc.nextInt();
		
		System.out.println("enter Passenger Name"); //position=3
		String passengerName=sc.next();
		
		System.out.println("enter Passenger Age"); //position=3
		int passengerAge=sc.nextInt();
		
		return new Node(seatNo,passengerName,passengerAge);
	}

	private static void deleteMid(Node head) {
		Node temp=head;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Position to delete"); //position=3
		int position=sc.nextInt();
		
		int i=1;
		while(i<position-1)
		{
			temp=temp.getNext();
		}
		
		Node temp1=temp.getNext();
		temp.setNext(temp1.getNext());
	}

	

	
}


//write 3 functions
//1. delete first
//2. delete last
//3. delete mid
