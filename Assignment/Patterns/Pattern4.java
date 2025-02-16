import java.util.Scanner;
// To print the following pattern 
// 1
// 12
// 123
// 1234
// 12345
public class Pattern4
{
    public static void main(String[] arge)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ;i++)
        {
            for(int j = 1 ; j <= i ; j ++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}