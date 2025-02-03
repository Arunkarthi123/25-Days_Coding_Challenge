
import java.util.Arrays;

public class ReverseArray1
{
    public static void main(String[] args) {
        int[] arr = {6,2,4,6,0,5,8,2};
        Arrays.sort(arr);
        int st = 0 ,end = arr.length -1 ;
        System.out.println(Arrays.toString(arr));
        while(st<end)
        {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        System.out.print(Arrays.toString(arr));
    }
}