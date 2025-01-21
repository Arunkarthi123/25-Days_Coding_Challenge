

public class Inheritance3
{
    public static void main(String[] args)
    {
        Details a1 = new Details("Arun",18,100.0);
    }
}
class Details extends Greetings
{
    public Details(String name , int age , Double marks)
    {
        System.out.println("Name : "+name+" Age : "+age+" Mark : "+marks);
    }
}
class Greetings
{

    public Greetings()
    {
        System.out.println("Hi sir , Yours Details are listed below :");
    }
}