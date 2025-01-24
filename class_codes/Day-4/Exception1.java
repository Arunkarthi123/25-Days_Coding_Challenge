public class Exception1
{
    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Hai");
            System.out.println(123/0); // Exception occurs .
            System.out.println("In try"); //will not execute because compiler will not return back to try block .
        }        
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Outside try");
    }
}
// output :
//     Hai
//     java.lang.ArithmeticException: / by zero
//     Outside try