//Problem Statement
//Create a Book class and implement a search feature that looks up a book by title and returns its details.
//Class Name: Book
//Private Fields:
//        ○ title (String)
//        ○ author (String)
//        ○ price (double)
//Requirements
//        ● Take input for 3 books (title, author, price).
//        ● Validate: price must be >= 0.
//        ● Prompt user to enter a title to search.
//        ● Display the book's author and price if found, otherwise print "Book not found."

package Encapsulation.Task07;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] b = new Book[3];
        System.out.println("Enter Book Details");
        for(int i=0; i< b.length; i++){
            b[i]=new Book();
            System.out.println("Book "+(i+1));
            System.out.print("Author: ");
            b[i].setAuthor(sc.nextLine());
            System.out.print("Title: ");
            b[i].setTitle(sc.nextLine());
            System.out.print("Price: ");
            b[i].setPrice(sc.nextDouble());
            sc.nextLine();
        }
        String searchTitle;
        System.out.println("Enter Book Title to Search");
        searchTitle=sc.nextLine();
        boolean isFound = false;
        for(Book k: b){
            if(k.getTitle().equalsIgnoreCase(searchTitle)){
                System.out.println("Book Author: " + k.getAuthor());
                System.out.println("Book Price: " + k.getPrice());
                isFound=true;
                break;
            }

        }
        if(!isFound) System.out.println("Book Not Found.");
    }
}
