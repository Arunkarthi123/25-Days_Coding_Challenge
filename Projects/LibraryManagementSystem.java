import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String args[]) {
        Librarian librarian = new Librarian("Raja", 1);

        librarian.addBook(101, "Java Programming");
        librarian.addBook(102, "Data Structures");
        librarian.addBook(103, "Algorithms");

        Visitors visitor1 = new Visitors(77, "Arun");
        Visitors visitor2 = new Visitors(27, "Karthi");

        librarian.addVisitor(visitor1);
        librarian.addVisitor(visitor2);

        librarian.issueBook(new Date(), visitor1, 101); 

        librarian.returnBook(visitor1, 101); 

        librarian.viewBooks();
    }
}

class Book {
    private int book_id;
    private String BookName;
    private boolean issue_status;
    private Date issue_date;

    public Book(int id, String name) {
        this.book_id = id;
        this.BookName = name;
        this.issue_status = false;
    }

    public int getBook_id() {
        return this.book_id;
    }

    public String getBook_name() {
        return this.BookName;
    }

    public boolean getIssue_status() {
        return issue_status;
    }

    public void setIssue_status(boolean status) {
        this.issue_status = status;
    }

    public Date getIssue_date() {
        return this.issue_date;
    }

    public void setIssue_date(Date date) {
        this.issue_date = date;
    }
}

class Library {
    private List<Book> books = new ArrayList<>();
    private List<Visitors> visitors = new ArrayList<>();

    protected void addBookToLibrary(Book book) {
        this.books.add(book);
    }

    protected void addVisitorToLibrary(Visitors visitor) {
        this.visitors.add(visitor);
    }

    protected List<Book> getBooks() {
        return books;
    }

    protected Visitors findVisitorById(int id) {
        for (Visitors visitor : visitors) {
            if (visitor.id == id) {
                return visitor;
            }
        }
        return null;
    }

    protected Book findBookById(int id) {
        for (Book book : books) {
            if (book.getBook_id() == id) {
                return book;
            }
        }
        return null;
    }
}

class Librarian extends Library {
    String librarian_name;
    int librarian_id;
    double salary;

    public Librarian(String name, int id) {
        this.librarian_name = name;
        this.librarian_id = id;
    }

    void addBook(int id, String name) {
        Book book = new Book(id, name);
        super.addBookToLibrary(book);
        System.out.println("Book added: " + name);
    }

    void addVisitor(Visitors visitor) {
        super.addVisitorToLibrary(visitor);
        System.out.println("Visitor added: " + visitor.name);
    }

    void issueBook(Date date, Visitors visitor, int bookId) {
        Book book = findBookById(bookId);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (book.getIssue_status()) {
            System.out.println("Book is already issued.");
            return;
        }
        book.setIssue_status(true);
        book.setIssue_date(date);
        System.out.println("Book issued: " + book.getBook_name() + " to " + visitor.name);
    }

    void returnBook(Visitors visitor, int bookId) {
        Book book = findBookById(bookId);
        if (book == null || !book.getIssue_status()) {
            System.out.println("Book not found or not issued.");
            return;
        }
        book.setIssue_status(false);
        book.setIssue_date(null);
        System.out.println("Book returned: " + book.getBook_name() + " by " + visitor.name);
    }

    void viewBooks() {
        System.out.println("Available Books:");
        for (Book book : getBooks()) {
            System.out.println("ID: " + book.getBook_id() + ", Name: " + book.getBook_name() +
                               ", Issued: " + (book.getIssue_status() ? "Yes" : "No"));
        }
    }
}

class Visitors {
    protected int id;
    protected String name;
    Date join_date;

    public Visitors(int id, String name) {
        this.id = id;
        this.name = name;
        this.join_date = new Date();
    }
}
