package day20;

public class BookCopies {

	private int copyNo;

    private boolean available=true;

    private String studentName;

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

    @Override
    public String toString() {
        return "Copy No = " + copyNo +
                ", Available = " + available +
                ", Student = " + studentName;
    }
	}