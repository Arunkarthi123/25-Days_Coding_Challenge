
import java.util.Scanner;

public class Exception3
{
    static public void main(String [] arg)
    {
        Scanner in = new Scanner(System.in);
        try
        {
            int[] arr =new int[-1];
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}