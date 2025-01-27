
import java.util.Arrays;
import java.util.Scanner;

// TO print the following pattern :
//     1 -> 2 -> 3
//               |
//               v
//     8 -> 9    4
//     ^         |
//     |         v
//     7 <- 6 <- 5

public class Spiral 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Row and Column :");
        Matrix mat = new Matrix(in.nextInt(),in.nextInt());
        mat.addElements();
        mat.printElements();        
    }
}
class Matrix
{
    int row;
    int col;
    int[][] matrix;
    public Matrix(int row , int col)
    {
        this.row = row ;
        this.col = col ;
        matrix = new int[row][col];
    }
    public void addElements()
    {
        int val = 1;
        int left = 0 , right = col - 1 ;
        int top = 0 , bottom = row - 1 ;
        while(left <= right && top <= bottom)
        {
            for(int i = left ; i <= right ; i++ )
            {
                this.matrix[top][i] = val++;
            }
            top++;
            for(int i = top ; i<=bottom ; i++)
            {
                this.matrix[i][right] = val ++;
            }
            right--;
            if(top<=bottom)
            {
                for(int i = right ; i>=left;i--)
                {
                    this.matrix[bottom][i]=val++;
                }
                bottom--;
                
            }
            if(left<=right)
            
            {
                for(int i = bottom;i>=top;i--)
                {
                    this.matrix[i][left]=val++;
                }
                left++;
            }
        }
    }
    public void printElements()
    {
        for(int[] i : matrix)
        {
            System.out.println(Arrays.toString(i));
        }
    }
}