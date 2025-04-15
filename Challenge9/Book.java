package Challenge9;

public class Book {
    String title;
    String author;
    int isbn;
    static int totalBooks;
    boolean isBorrowed;

    Book(String author, String title, int isbn) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }

    static {
        totalBooks = 0;
    }

    void borrowBook() {

    }

    void returnBook() {

    }
}
