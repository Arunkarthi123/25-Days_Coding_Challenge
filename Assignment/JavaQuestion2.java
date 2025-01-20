/* Problem Statement :
You are tasked with building a simple library system using the Book class. Complete the following steps:
The Book class contains the following private attributes: title (String),author (String) and price (double). It also has a method displayBookDetails() that prints the details of a book
In the Library class create two Book objects (Use constuctor):
The first book titled "The Secret", authored by "Banu", with a price of 350.
The second book titled "Atomic Habits", authored by "James", with a price of 300.
Display the details of both books using the displayBookDetails() method. 
Apply a 15% discount to the second book (book2) using the getDiscountedPrice method. Display the updated details of the second book after applying the discount. 
Output:
Title: The Secret, Author: Banu, Price: 350.0
Title: Atomic Habits, Author: James, Price: 300.0
Discounted Price
Title: Atomic Habits, Author: James, Price: 255.0
*/
public class JavaQuestion2
{
    static public void main(String[] args)
    {
        Book b1 = new Book("The Secret","Banu",350);
        Book b2 = new Book("Atomic Habits","james",300);
        b1.displayBookDetails();
        b2.displayBookDetails();
        System.out.println("Discounted price of b2 : "+b2.getDiscountedPrice());
        b2.displayBookDetails();
    }
}
class Book
{
    private String title;
    private String author;
    private  double price;
    Book(String title , String author , double  price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayBookDetails()
    {
        System.out.println("Title: "+title+" , Author: "+author+" , Price: "+price);
    }
    double getDiscountedPrice()
    {
        price= price-(0.15*price);
        return price;
    }
}