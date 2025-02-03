import java.util.Scanner;
public class Pattern6
{
    // Program to print the following pattern 
    // 1 
    // 2 6 
    // 3 7 10 
    // 4 8 11 13 
    // 5 9 12 14 15 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for(int i = 1 ;i<=n;i++)
        {
            System.out.print(i+" ");
            int k =i;
            for(int j = n-1;j>n-i;j--)
            {
                k+=j;
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}