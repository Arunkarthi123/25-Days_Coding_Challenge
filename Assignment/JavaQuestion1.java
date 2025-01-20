/* Problem Statement :
You are tasked with building a simple library system using the Book class. Complete the following steps:
The Book class contains the following public attributes: title (String),author (String) and price (double). It also has a method displayBookDetails() that prints the details of a book
In the Library class create two Book objects:
The first book titled "The Secret", authored by "Banu", with a price of 350.
The second book titled "Atomic Habits", authored by "James", with a price of 300.
Display the details of both books using the displayBookDetails() method.
Output:
Title: The Secret, Author: Banu, Price: 350.0
Title: Atomic Habits, Author: James, Price: 300.0 
*/
public class JavaQuestion1
{
    static public void main(String[] args)
    {
        Book b1 = new Book("The Secret","Banu",350);
        Book b2 = new Book("Atomic Habits","james",300);
        b1.displayBookDetails();
        b2.displayBookDetails();
    }
}
class Book
{
    public String title;
    public String author;
    public double price;
    Book(String title , String author , double  price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayBookDetails()
    {
        System.err.println("Title: "+title+" , Author: "+author+" , Price: "+price);
    }
}
