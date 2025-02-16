import java.util.Scanner;
// To print the following pattern 
//     n = 5
//     *****
//     *****
//     *****
//     *****
//     *****
public class Pattern1
{
    public static void main(String [] arggs)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}