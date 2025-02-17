import java.util.Scanner;
public class Dp1
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int subsequence = longestSubSequence(s1 , s2 , 0 , 0);
        System.out.println(subsequence);
        sc.close();        
    }
    public static int longestSubSequence(String s1 , String s2 , int i , int j)
    {
        if( i == s1.length() ||j == s2.length())
        {
            return 0 ;
        }
        if(s1.charAt(i) == s2.charAt(j))
        {
            return 1 + longestSubSequence(s1, s2, i + 1, j + 1);
        }
        int n1 = longestSubSequence(s1, s2, i, j + 1);
        int n2 = longestSubSequence(s1, s2, i + 1, j);
        return n1 < n2 ? n2 : n1 ;
    }
}