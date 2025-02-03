import java.util.*;
public class LuckyNumber1
{
    public static void main(String[] args) 
    {
        int m =3;
        int n =3;
        Solution s = new Solution(m,n);
        int[][] a = s.getArray();
        s.printArray(a);
        s.luckyNumber();
        System.out.println(s.getList());
    }
   
}
class Solution
{
    private int m;
    private  int n;
    private int[][] arr;
    private Scanner sc = new Scanner(System.in);
    private List<Integer> list = new ArrayList<>();
    public Solution(int m , int n)
    {
        this.m = m;
        this.n = n;
        this.arr = new int[m][n];
        this.createArray();
    }
    private void createArray()
    {
        System.out.println("Enter elements :");
        for(int i =0 ;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public void printArray(int[][] a)
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
    public void luckyNumber()
    {
        List<Integer> col_max = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            int max =Integer.MIN_VALUE;
            for(int j =0;j<m;j++)
            {
                max = max < arr[j][i] ? arr[j][i] : max;
            }
            col_max.add(max);
        }
        for(int i =0;i<m;i++)
        {
            int min=Integer.MAX_VALUE;
            int ind = -1;
            for(int j =0;j<n;j++)
            {
                if(arr[i][j]<min)
                {
                    min = arr[i][j];
                    ind =j;
                }
            }
            if(col_max.get(ind) == min)
            {
                list.add(min);
            }
        }
        System.out.println(col_max);
    }
    public List<Integer> getList()
    {
        return list;
    }


}

