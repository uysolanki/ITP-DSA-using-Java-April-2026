package day26;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BSTUsingCollectionFramework2 {
public static void main(String[] args) {
	Passenger passenger1=new Passenger(18, "Virat", 38);
	Passenger passenger2=new Passenger(45, "Rohit", 39);
	Passenger passenger3=new Passenger(1, "Rahul", 34);
	Passenger passenger4=new Passenger(33, "Hardik", 32);
	Passenger passenger5=new Passenger(7, "Dhoni", 41);
	Set<Passenger> tree1=new TreeSet();
	
	tree1.add(passenger1);
	tree1.add(passenger2);
	tree1.add(passenger3);
	tree1.add(passenger4);
	tree1.add(passenger5);
	
	//System.out.println(tree1);
	tree1.stream().forEach(System.out::println);
	
	System.out.println("-----------------------");
	
	Comparator<Passenger> c1=(o1,o2)->{
		if(o1.getSeatNo() > o2.getSeatNo())
			return 1;
		else if(o1.getSeatNo() < o2.getSeatNo())
			return -1;
		else
			return 0;
	};
	
//	Set<Passenger> tree2=new TreeSet(new SeatNoComparator());
	Set<Passenger> tree2=new TreeSet(c1);
	
	tree2.add(passenger1);
	tree2.add(passenger2);
	tree2.add(passenger3);
	tree2.add(passenger4);
	tree2.add(passenger5);
	
	//System.out.println(tree2);
	tree2.stream().forEach(System.out::println);
	
	System.out.println("-----------------------");
	Comparator<Passenger> c2=(o1,o2)->o1.getPassName().compareTo(o2.getPassName());
	
	Set<Passenger> tree3=new TreeSet(c2);
	
	tree3.add(passenger1);
	tree3.add(passenger2);
	tree3.add(passenger3);
	tree3.add(passenger4);
	tree3.add(passenger5);
	
	//System.out.println(tree2);
	tree3.stream().forEach(System.out::println);
}
}
