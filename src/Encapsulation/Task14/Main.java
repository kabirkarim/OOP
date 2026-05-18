//Problem Statement
//Build a fully interactive library system with a menu-driven interface that supports borrowing and
//        returning books, with real-time copy tracking.
//Class Name: Book
//Private Fields:
//        ○ title (String)
//        ○ author (String)
//        ○ copies (int) — must be &gt;= 0
//Requirements
//        ● Input details for 3 books (title, author, copies).
//        ● Present a menu: 1) Show all books 2) Borrow a book 3) Return a book 4) Exit
//        ● Borrow reduces copies by 1 — cannot go below 0; show an error if no copies remain.
//        ● Return increases copies by 1.
//        ● Search by title for borrow/return; display &#39;Book not found&#39; if title does not match.
//        ● Loop until the user selects Exit.

package Encapsulation.Task14;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[3];


        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Book " + (i + 1));

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Copies: ");
            int copies = sc.nextInt();
            sc.nextLine();

            books[i] = new Book(title, author, copies);
            System.out.println();
        }

        int choice;

        do {
            // Menu
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Show all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Books:");
                    for (Book book : books) {
                        book.displayBook();
                    }
                    break;

                case 2:

                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = sc.nextLine();

                    boolean foundBorrow = false;

                    for (Book book : books) {
                        if (book.getTitle().equalsIgnoreCase(borrowTitle)) {
                            book.borrowBook();
                            foundBorrow = true;
                            break;
                        }
                    }

                    if (!foundBorrow) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:

                    System.out.print("Enter book title to return: ");
                    String returnTitle = sc.nextLine();

                    boolean foundReturn = false;

                    for (Book book : books) {
                        if (book.getTitle().equalsIgnoreCase(returnTitle)) {
                            book.returnBook();
                            foundReturn = true;
                            break;
                        }
                    }

                    if (!foundReturn) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Library System...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);


    }
}
