
import java.util.Scanner;

public class PrimeNum
{
    static public void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
            System.out.println(isprime(sc.nextInt()));
        
    }
    static boolean isprime(int n)
    {
        for(int i = 2;i<n;i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }               
}