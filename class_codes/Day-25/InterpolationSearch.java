
import java.util.Scanner;

public class InterpolationSearch
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();
        Search s = new Search();
        System.out.print("Enter Search value");
        int val = sc.nextInt();
        System.out.println("The element found at : "+s.indexOf( val , arr));
    }
}
class Search
{
    public int indexOf(int val , int[] arr)
    {
        int st = 0 , end = arr.length - 1 ;
        while(st <= end)
        {
            int pos = st + (end - st) * ( val - arr[st]) /( arr[end] - arr[st]) ;
            System.out.println(st + " "+ pos + " "+ end);
            if(arr[pos] == val)
                return pos;
            else if(arr[pos] < val)
                end = pos - 1;
            else
                st = pos + 1;
        }
        return -1;
    }
}