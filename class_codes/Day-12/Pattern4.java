import java.util.Scanner;
public class Pattern4
{
    // Program to print the following pattern 
    // 1 
    // 2 1 
    // 3 2 1 
    // 4 3 2 1 
    // 5 4 3 2 1 
    // 6 5 4 3 2 1 
    // 7 6 5 4 3 2 1 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for(int i = 1 ;i<=n;i++)
        {
            for(int j = i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}