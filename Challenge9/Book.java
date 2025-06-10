package Challenge9;

public class Book {
    static int totalBooks;
    String title;
    String author;
    int isbn;
    boolean borrowBook = false;

    static {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    Book() {
        title = "Unknown";
        author = "Unknown";
        isbn = 0;
    }

    Book(int isbn) {
        this.isbn = isbn;
        author = "Saad";
        title = "rdr";
    }

    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static int getTotalNoOfBooks() {
        return totalBooks;
    }

    void borrowBook() {
        if (borrowBook) {
            System.out.println("Book is already borrowed");
        } else {
            borrowBook = true;
            System.out.println("Book borrowed");
        }
    }

    void returnBook() {
        if (borrowBook) {
            borrowBook = false;
            System.out.println("book returned");
        } else {
            System.out.println("Book is not borrowed");
        }
    }

    public static void main(String[] args) {
        Book obj = new Book();
        // obj.author = "Saif Ali Khan";
        // // obj.title = "MC";
        obj.isbn = 123;
        obj.borrowBook();
        System.out.println(obj.author + obj.title + obj.isbn);
        System.out.println(getTotalNoOfBooks());
        obj.returnBook();
    }
}