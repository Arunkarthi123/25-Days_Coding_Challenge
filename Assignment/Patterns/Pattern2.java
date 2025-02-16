import java.util.Scanner;
// To print the following pattern 
// *
// **
// ***
// ****
// *****
public class Pattern2
{
    public static void main(String[] arge)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i< n ;i++)
        {
            for(int j = n - i ; j <= n ; j ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}