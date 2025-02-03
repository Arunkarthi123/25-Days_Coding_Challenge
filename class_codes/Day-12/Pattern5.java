import java.util.Scanner;
public class Pattern5
{
    // Program to print the following pattern 
    // 1 
    // 0 1 
    // 1 0 1 
    // 0 1 0 1 
    // 1 0 1 0 1 
    // 0 1 0 1 0 1 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for(int i = 1 ;i<=n;i++)
        {
            for(int j = i;j>=1;j--)
            {
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
    }
}