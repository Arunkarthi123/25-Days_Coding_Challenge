
import java.util.*;
public class BubbleSort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        Sort s = new Sort(arr);
        s.printSortedArray();
        System.out.println(Arrays.toString(s.getSortedArray()));
    }
}
class Sort 
{
    private int arr[];
    int length;
    public Sort(int[] arr)
    {
        this.arr = arr;
        length = arr.length;
        this.sort();
    }
    private void sort()
    {
        for(int i = 0 ; i < length ; i++)
        {
            boolean swap = false;
            for(int j = 0 ; j < length - i - 1 ; j++)
            {
                if(arr[j+1] < arr[j])
                {
                    arr[j+1] = arr[j+1] + arr[j] ;
                    arr[j] = arr[j+1] - arr[j] ;
                    arr[j+1] = arr[j+1] - arr[j] ;
                    swap = true;
                }
            }
            if(! swap)
                return;
        }
    }
    public int[] getSortedArray()
    {
        return this.arr;
    }
    public String toString()
    {
        String s ="";
        for(int i : arr)
            s = s + i+" ";
        return s;
    }
    public void printSortedArray()
    {
        System.out.println(this.toString());
    }
}