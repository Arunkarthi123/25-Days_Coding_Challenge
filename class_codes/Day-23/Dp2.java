
import java.util.Arrays;
import java.util.Scanner;

public class Dp2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int[][] dp = new int[s1.length() + 1 ][s2.length() + 1];
        String[][] seq = new String[s1.length() + 1][s2.length()  + 1];
        for(int i = 0 ; i <= s1.length();i++)
        {
            seq[i][0] = "";
        }
        for(int i = 0 ; i <= s2.length();i++)
        {
            seq[0][i] = "";
        }
        for(int i = 0 ; i < s1.length() ; i++)
        {
            for(int j = 0 ; j < s2.length() ; j++)
            {
                if(s1.charAt(i) == s2.charAt(j))
                {
                    seq[i + 1][ j + 1] = seq[i][j] + s1.charAt(i);
                    dp[i + 1][ j + 1] = dp[i][j] + 1;
                }
                else
                {
                    dp[i + 1][j + 1] = dp[i + 1][j] <  dp[i][j +1] ? dp[i][j +1] : dp[i + 1][j] ;
                    seq[i + 1][ j + 1] = dp[i + 1][j] <  dp[i][j +1] ? seq[i][j + 1] : seq[i + 1][j] ;
                }
            }
        }
        for(int i = 0 ; i < dp.length ; i++)
        {
            System.out.println(Arrays.toString(dp[i]));
        }
        System.out.println("The longest SubSequence length : "+dp[s1.length()][s2.length()]);
        System.out.println("The longest SubSequence : "+seq[s1.length()][s2.length()]);
        
        sc.close();
    }
}