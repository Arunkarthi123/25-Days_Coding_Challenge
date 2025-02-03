import java.util.*;
public class Largemul1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul ;
        int[] arr = new int[n];
        for(int i =0 ;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        n--;
        for(int i = n ; i>n-3;i--)
        {
            for(int j = 0 ;j<i;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j] ;
                    arr[j] = temp;
                }
            }
        }
        int mul1 = arr[n-1]*arr[n];
        System.out.println(Arrays.toString(arr));
        for(int i = 0;i<3;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[j] ;
                    arr[j] = temp;
                }
            }
        }
        int mul2 = arr[0] * arr[1];
        System.out.println(Arrays.toString(arr));
        mul = arr[0]*arr[1] < arr[n-2]*arr[n-1] ? arr[n-2] * arr[n-1] : arr[0] * arr[1];
        System.out.println("Largest multiple :"+ mul );
    }
}