import java.util.Arrays;
import java.util.Scanner;
public class MergeSort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] =sc.nextInt();
        }        
        Sort sort = new Sort(arr);
        int[] sortedarr = sort.getSortedArray();
        sort.display();
        System.err.println(Arrays.toString(sortedarr));
    }
}
class Sort
{
    private int[] arr;
    private int length;
    public Sort(int[] arr)
    {
        this.arr = arr;
        this.length = arr.length;
        mergesort(0, length - 1);
    }
    private void  mergesort(int st , int end)
    {
        if(st >= end)
            return ;
        int mid = st + (end - st) / 2;
        mergesort(st , mid);
        mergesort(mid + 1 , end);
        merge(st , mid , end);
    }
    private void merge(int st ,int mid, int end)
    {
        int arr1[] = new int[end - st + 1 ];
        int i = st;
        int j = mid + 1 ;
        int k =0;
        while(i <= mid && j <= end)
        {
            if(arr[i] < arr[j])
            {
                arr1[k] = arr[i++]; 
            }
            else
            {
                arr1[k] = arr[j++];
            }
            k++;
        }
        while(i <= mid)
        {
            arr1[k++] = arr[i++];
        }
        while(j <= end)
        {
            arr1[k++] = arr[j++];
        }
        int y = st;
        for(int x = 0 ; x < arr1.length ; x++)
        {
            arr[y++] = arr1[x]; 
        }
    }
    public String toString()
    {
        String s ="";
        for(int i : arr)
        {
            s = s + i + " ";
        }
        return s;
    }
    public void display()
    {
        System.out.println(this.toString());
    }
    public int[] getSortedArray()
    {
        return arr;
    }
}
