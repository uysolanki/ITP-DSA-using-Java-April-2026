package day2;

public class StudentDriver {

	public static void main(String[] args) {
//		Student s=new Student();
//		Student s1=new Student();
//		Student s2=new Student();
		
		Student s=new Student(18,"Virat",78.5);
		Student s1=new Student(45,"Rohit",88.5);
		Student s2=new Student(63,"Surya",98.5);
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		
		
		Student s4=s1;  //shallow copy ref copy
		s4.setName("Sharma");
		
		Student s5=new Student(s2);
		
		System.out.println(s1.getName());
		
		s5.setName("Yadav");
		
		System.out.println(s2.getName());
		
	}

}
