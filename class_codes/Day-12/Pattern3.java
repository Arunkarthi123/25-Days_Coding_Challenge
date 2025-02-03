import java.util.Scanner;
public class Pattern3
{
    // Program to print the following pattern 
    // 1 1 1 1 1 
    //   2 2 2 2 
    //     3 3 3 
    //       4 4 
    //         5 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for(int i = 1 ;i<=n;i++)
        {
            int k;
            for(k =1;k<i;k++)
            {
                System.out.print("  ");
            }
            for(int j = i-1;j < n;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}