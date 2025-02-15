import java.util.*;
public class Nqueen1 
{
    static int board[][];
    static int n;
    static boolean safe(int row, int col)
    {
        for(int j=0;j<col;j++)
        if(board[row][j]==1)
        return false;
        
        for(int i=row-1,j=col-1;j>=0&&i>=0;i--,j--)
        if(board[i][j]==1)
        return false;
        
        for(int i=row+1,j=col-1;j>=0&&i<n;i++,j--)
        if(board[i][j]==1)
        return false;
        
        return true;
    }
    static boolean queen(int qn)
    {
        if(qn==n)
            return true;
        else 
        {
           for(int i=0;i<n;i++)
           {
            if(safe(i,qn)) 
            {
                board[i][qn]=1;
                if(queen(qn+1))
                return true;
                board[i][qn]=0;
            }
           }
           return false;
       }
       
    }
    public static void main(String a[])
    {
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      board=new int[n][n];
      if(queen(0))
      {
          for(int i=0;i<n;i++,System.out.println())
          for(int j=0;j<n;j++)
          System.out.print(board[i][j]+" ");
      }
      else
      System.out.print("No solution");
      
    }
}