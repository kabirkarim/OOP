package Encapsulation.Task14;

class Book {

    private String title;
    private String author;
    private int copies;


    public Book(String title, String author, int copies) {
        this.title = title;
        this.author = author;

        if (copies >= 0) {
            this.copies = copies;
        } else {
            this.copies = 0;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getCopies() {
        return copies;
    }

    public void borrowBook() {
        if (copies > 0) {
            copies--;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("No copies available.");
        }
    }

    public void returnBook() {
        copies++;
        System.out.println("Book returned successfully.");
    }


    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Copies Available: " + copies);
        System.out.println("-----------------------------");
    }
}