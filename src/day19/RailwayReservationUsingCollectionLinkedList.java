package day19;

import java.util.LinkedList;
import java.util.Scanner;

public class RailwayReservationUsingCollectionLinkedList {
public static void main(String[] args) {
	LinkedList<Passenger> reservationList=new LinkedList();
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
		case 1 : makeReservation(reservationList); break;
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
					int ans=viewReservationByPassengerName(reservationList,pasName); break;
			case 2 : System.out.println("Enter Seat Number to search"); 
					int sno=sc.nextInt();
					int ans1=viewReservationBySeatNumber(reservationList,sno); 
					if(ans1==0)
						System.out.println("Record does not exist");
					break;
			case 0 : break;
			} 
			break;
		case 3 : 	System.out.println("Enter Seat Number to cancel"); 
					int sno=sc.nextInt();
					if(viewReservationBySeatNumber(reservationList,sno)==1)
					{
					cancelReservation(reservationList,sno);
					System.out.println("Seat Number "+sno + " cancelled");
					}
					else
					{
						System.out.println("Invalid Seat Number");
					}
					break;
		case 4 : viewAllReservations(reservationList); break;
		case 5 :System.exit(0);
		}
	}while(choice!=0);

}

private static void cancelReservation(LinkedList<Passenger> reservationList, int sno) {
	for(Passenger passenger:reservationList)
	{
		if(passenger.getSeatNo()==sno)
		{
			reservationList.remove(passenger);
		}
	}
	
}

private static int viewReservationByPassengerName(LinkedList<Passenger> reservationList, String pasName) {
	int flag=0;
	for(Passenger passenger:reservationList)
	{
		if(passenger.getPassName().equalsIgnoreCase(pasName))
		{
			flag=1;
			display(passenger);
		}
	}
	return flag;
}

private static int viewReservationBySeatNumber(LinkedList<Passenger> reservationList, int sno) {
	int flag=0;
	for(Passenger passenger:reservationList)
	{
		if(passenger.getSeatNo()==sno)
		{
			flag=1;
			display(passenger);
		}
	}
	return flag;
}

private static void viewAllReservations(LinkedList<Passenger> reservationList) {
	for(Passenger passenger:reservationList)
	{
		display(passenger);
	}
	
}

private static void makeReservation(LinkedList<Passenger> reservationList) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Seat Number"); 
	int seatNo=sc.nextInt();
	
	System.out.println("enter Passenger Name"); 
	String passengerName=sc.next();
	
	System.out.println("enter Passenger Age"); 
	int passengerAge=sc.nextInt();
	
	Passenger passenger=new Passenger(seatNo,passengerName,passengerAge);
	reservationList.add(passenger);
}

private static void display(Passenger passenger)
{
	System.out.println(String.format("%-20s%d","Passenger Age ",passenger.getPassAge()));
	System.out.println(String.format("%-20s%s","Passenger Name ", passenger.getPassName()));
	System.out.println(String.format("%-20s%d","Seat Number ",+passenger.getSeatNo()));
	System.out.println("--------------------");
}
}
