import java.util.Arrays;
import java.util.Scanner;
public class Transpose1
{
    public static void main(String[] args)
    {
        int m = 5 , n =3;
        int[][] array = createArray(m,n);  
        System.out.println("Original array");      
        printArray(array);
        int[][] transpose = transposeArray(array, m, n);
        System.out.println("Transpose array");      
        printArray(transpose);        
    }
    static int[][] createArray(int m ,int n)
    {
        
        int[][] arr = new int[m][n];
        System.out.println("Enter the elements for array " + m + " x "+ n+" : ");
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<m;i++)
        {
            for(int j = 0 ; j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    static void printArray(int[][] arr)
    {
        for(int[] i : arr)
        {
            System.out.println(Arrays.toString(i));
        }
    }
    static int[][] transposeArray(int[][] arr , int m ,int n)
    {
        int[][] trr = new int[n][m];
        for(int i =0;i<m;i++)
        {
            for(int j = 0 ; j<n;j++)
            {
                trr[j][i] = arr[i][j];
            }
        }
        return trr;
    }
}