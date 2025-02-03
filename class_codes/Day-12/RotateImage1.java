import java.util.Arrays;
import java.util.Scanner;
public class RotateImage1
{
    public static void main(String[] args)
    {
        int n = 3;
        Solution s = new Solution(n);
        int[][] arr = s.getArray();
        System.out.println("Original Array : ");
        s.printArray(arr, n);
        int[][] rotated = s.getArray();
        s.rotate();
        System.out.println("Rotated  Array :");
        s.printArray(rotated, n);
    }
}
class Solution
{
    private int[][] arr;
    private int m;
    private Scanner sc = new Scanner(System.in);
    public Solution(int m )
    {
        this.m = m;
        this.arr = new int[m][m];
        this.createArray();
    }
    private void createArray()
    {
        System.out.println("Enter elements :");
        for(int i = 0;i<m;i++)
        {
            for(int j =0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    private void transpose()
    {
        for(int i =0;i<m;i++)
        {
            for(int j =i+1;j<m;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public void rotate()
    {
        this.transpose();
        for(int i =0;i<m;i++)
        {
            int st =0;
            int end = m-1;
            while(st<end)
            {
                int temp = arr[i][st];
                arr[i][st] = arr[i][end];
                arr[i][end] = temp;
                st++;
                end--;
            }
        }
    }
    public void printArray(int[][] a , int n)
    {
        for(int[] i : a)
        {
            System.out.println(Arrays.toString(i));
        }
    }
    public int[][] getArray()
    {
        return arr;
    }
}