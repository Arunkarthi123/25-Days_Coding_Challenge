import java.util.Scanner;
// Program to get the following pattern :
//      * 
//     * * 
//    * * * 
//   * * * * 
//  * * * * * 
public class Pattern10
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i ; j < n ; j ++)
            {
                System.out.print(" ");
            }
            for(int j = n ; j >= n - i ; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}