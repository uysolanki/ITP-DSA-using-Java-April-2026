package day22;

import java.time.LocalDate;

public class BookCopies {

	private int copyNo;

    private boolean available=true;

    private String studentName;
    
    private LocalDate borrowDate;
    private LocalDate dueDate;
    
    private LocalDate returnDate;
    
    
    public BookCopies() {}

    public BookCopies(int copyNo) {
        this.copyNo = copyNo;
    }

    public int getCopyNo() {
        return copyNo;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    

    public LocalDate getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(LocalDate borrowDate) {
		this.borrowDate = borrowDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public void setCopyNo(int copyNo) {
		this.copyNo = copyNo;
	}

	
	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "BookCopies [copyNo=" + copyNo + ", available=" + available + ", studentName=" + studentName
				+ ", borrowDate=" + borrowDate + ", returnDate=" + returnDate + "]";
	}

	
	}