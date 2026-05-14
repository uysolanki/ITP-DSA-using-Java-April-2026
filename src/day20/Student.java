package day20;

public class Student {
	 private int rollNo;
	    private String studentName;

	    public Student() {}

	    public Student(int rollNo, String studentName) {
	        this.rollNo = rollNo;
	        this.studentName = studentName;
	    }

	    public int getRollNo() {
	        return rollNo;
	    }

	    public String getStudentName() {
	        return studentName;
	    }

	    @Override
	    public String toString() {
	        return "Student [rollNo=" + rollNo +
	                ", studentName=" + studentName + "]";
	    }
}
