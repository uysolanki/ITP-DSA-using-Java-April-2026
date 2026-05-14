package day20;

import java.util.ArrayList;

public class Book {

	private int bookId;
    private String bookName;
    private String author;
    private int qty;

    private ArrayList<BookCopies> copies = new ArrayList<>();

    public Book() {}

    public Book(int bookId, String bookName, String author, int qty) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.qty = qty;

        // create copies automatically
        for(int i=1;i<=qty;i++)
        {
            copies.add(new BookCopies(i));
        }
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getQty() {
        return qty;
    }

    public ArrayList<BookCopies> getCopies() {
        return copies;
    }
    
    public int getAvailableQty()
    {
        int count=0;

        for(BookCopies copy:copies)
        {
            if(copy.isAvailable())
            {
                count++;
            }
        }

        return count;
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + 
                ", bookName=" + bookName + 
                ", author=" + author + 
                ", qty=" + qty + "]";
    }
    
}
