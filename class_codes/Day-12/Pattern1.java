import java.util.Scanner;
public class Pattern1
{
    // Program to print the following pattern 
    //  *           * 
    //     *     *    
    //        *       
    //     *     *    
    // *            * 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter odd number : ");
        int n = sc.nextInt();
        for(int i = 0 ;i<n;i++)
        {
            for(int j = 0;j < n;j++)
            {
                if(i==j || n-j==i+1)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}