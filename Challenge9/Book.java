package Challenge9;

public class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    Book(String author, String title, String isbn) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalBooks() {
        return totalBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Book borrowed");
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Book returned");
        } else {
            System.out.println("Book was not borrowed");
        }
    }

    public static void main(String[] args) {
        Book book = new Book("James clear", "Atomic habits", "1");
        System.out.println(Book.getTotalBooks());
        book.borrowBook();
    }
}
