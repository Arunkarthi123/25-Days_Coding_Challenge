import java.util.Scanner;
// To print the following pattern 
// *****
// ****
// ***
// **
// *
public class Pattern3
{
    public static void main(String[] arge)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i< n ;i++)
        {
            for(int j = 0 ; j < n - i ; j ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}