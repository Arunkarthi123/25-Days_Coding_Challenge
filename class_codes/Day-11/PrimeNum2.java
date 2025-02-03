
import java.util.Scanner;

public class PrimeNum2
{
    static public void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
            System.out.println(isprime(sc.nextInt()));
        
    }
    static boolean isprime(int n)
    {
        if(n%2 == 0)
            return false;
        for(int i = 2;i<n/2;i+=2)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }               
}