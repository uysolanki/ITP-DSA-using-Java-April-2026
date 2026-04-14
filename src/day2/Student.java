package day2;

public class Student 
{
	private int rno;
	private String name;
	private double per;
//	public Student() 	//No Args Constructor
//	{
//		this.rno = 1;
//		this.name = "Raj";
//		this.per = 50.0;
//	}
	
	public Student() 	//No Args Constructor
	{
		
	}
//	public Student(int rno, String name, double per) {
//		this.rno = rno;
//		this.name = name;
//		this.per = per;	
//	}
	
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", per=" + per + "]";
	}
	
public Student(int rno, String name, double per)	//AllArgsConstructor
{
	super();
	this.rno = rno;
	this.name = name;
	this.per = per;
}


public Student(Student s2) {
	this.rno = s2.rno;
	this.name = s2.name;
	this.per = s2.per;
}
}
