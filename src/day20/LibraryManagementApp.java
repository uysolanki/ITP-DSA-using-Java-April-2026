package day20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementApp {

	public static void main(String[] args) {

        List<Book> library = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n*** LIBRARY MENU ***");

            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. View Books");
            System.out.println("0. Exit");

            System.out.println("Enter choice");
            choice = sc.nextInt();

            switch(choice)
            {
            case 1:
                addBook(library);
                break;

            case 2:
                borrowBook(library);
                break;

            case 3:
                returnBook(library);
                break;

            case 4:
                viewBooks(library);
                break;

            case 0:
                System.out.println("Thank You");
                break;

            default:
                System.out.println("Invalid Choice");
            }

        }while(choice!=0);

    }

    // ADD BOOK
    private static void addBook(List<Book> library)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book Id");
        int id = sc.nextInt();

        System.out.println("Enter Book Name");
        String name = sc.next();

        System.out.println("Enter Author");
        String author = sc.next();

        System.out.println("Enter Quantity");
        int qty = sc.nextInt();

        Book book = new Book(id,name,author,qty);

        library.add(book);

        System.out.println("Book Added Successfully");
    }

    // BORROW BOOK
    private static void borrowBook(List<Book> library)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book Id");   //1
        int id = sc.nextInt();

        for(Book book:library)
        {
            if(book.getBookId()==id)
            {
                for(BookCopies copy:book.getCopies())
                {
                    if(copy.isAvailable())
                    {
                        System.out.println("Enter Student Name");
                        String sname = sc.next();

                        copy.setAvailable(false);

                        copy.setStudentName(sname);

                        System.out.println("Book Borrowed Successfully");

                        System.out.println("Copy No : "
                                + copy.getCopyNo());

                        return;
                    }
                }

                System.out.println("No Copies Available");
                return;
            }
        }

        System.out.println("Book Not Found");
    }

    // RETURN BOOK
    private static void returnBook(List<Book> library)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book Id");
        int id = sc.nextInt();

        System.out.println("Enter Copy Number");
        int copyNo = sc.nextInt();

        for(Book book:library)
        {
            if(book.getBookId()==id)
            {
                for(BookCopies copy:book.getCopies())
                {
                    if(copy.getCopyNo()==copyNo)
                    {
                        if(!copy.isAvailable())
                        {
                            copy.setAvailable(true);

                            copy.setStudentName(null);

                            System.out.println("Book Returned Successfully");

                            return;
                        }
                        else
                        {
                            System.out.println("Please enter correct copy ID");

                            return;
                        }
                    }
                }
            }
        }

        System.out.println("Invalid Book Id / Copy No");
    }

    // VIEW BOOKS
    private static void viewBooks(List<Book> library)
    {
        for(Book book:library)
        {
            System.out.println("\n"+book);

            for(BookCopies copy:book.getCopies())
            {
                System.out.println(copy);
            }

            System.out.println("----------------------");
        }
    }

}
