package day22;

import java.util.ArrayList;
import java.util.List;

public class Student {
	 private int rollNo;
	    private String studentName;
	    private List<BookCopies> borrowedList=new ArrayList();
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

	    
	    public List<BookCopies> getBorrowedList() {
			return borrowedList;
		}

		public void setBorrowedList(List<BookCopies> borrowedList) {
			this.borrowedList = borrowedList;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		@Override
	    public String toString() {
	        return "Student [rollNo=" + rollNo +
	                ", studentName=" + studentName + "]";
	    }
}
