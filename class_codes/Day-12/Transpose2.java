// Without Additional memory for square matrix:
import java.util.Arrays;
import java.util.Scanner;
public class Transpose2
{
    public static void main(String[] args) 
    {
        Transpose t = new Transpose(5);
        int[][] arr = t.getArray();
        System.out.println("Original Array :");
        t.printArray(arr);
        t.transpose();
        int[][] transpose = t.getArray();
        System.out.println("Transposed Array :");
        t.printArray(transpose);
    }
}
class Transpose
{
    private int[][] arr;
    private int m ;
    public Transpose(int m ) 
    {
        arr = new int[m][m];
        this.m = m;
        this.createArray();
    }
    private  void createArray()
    {
        System.out.println("Enter the elements for array " + m + " x "+ m+" : ");
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<m;i++)
        {
            for(int j = 0 ; j<m;j++)
            {
                this.arr[i][j] = sc.nextInt();
            }
        }
    }
    public int[][] getArray()
    {
        return arr;
    }
    public void setArray(int[][] a)
    {
        this.arr = a;
    }
    public void transpose()
    {
        for(int i =0;i<m;i++)
        {
            for(int j =i+1 ;j<m;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public void printArray(int[][] a)
    {
        for(int[]  i : a)
        {
            System.out.println(Arrays.toString(i));
        }
    }
}